package com.niuren.base.base.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.niuren.base.base.BaseDao;

/**
 * 
 * <pre>
 * 项目名称：dxsit  
 * 类名称：BaseDaoImpl  
 * 类描述：  
 * 创建人：ZDX  
 * 创建时间：2015年1月25日 下午8:35:31  
 * 修改人：ZDX  
 * 修改时间：2015年1月25日 下午8:35:31  
 * 修改备注：  
 * @version
 * </pre>
 */
public class BaseDaoImpl<T> implements BaseDao<T> {

	protected Class<T> clazz;
	@Autowired
	private HibernateTemplate hibernateTemplate;

	private Logger log;

	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {
		ParameterizedType pt = (ParameterizedType) this.getClass()
				.getGenericSuperclass();
		clazz = (Class<T>) pt.getActualTypeArguments()[0];
		log = LoggerFactory.getLogger(clazz);
	}

	@Override
	public void insert(T t) {
		log.debug("saving " + clazz.getSimpleName() + " instance");
		try {
			hibernateTemplate.save(t);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	@Override
	public T update(T t) {
		log.debug("updating " + clazz.getSimpleName() + " instance");
		try {
			hibernateTemplate.update(t);
			log.debug("update successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}

		return t;
	}

	@Override
	public void delete(T t) {
		log.debug("deleting " + clazz.getSimpleName() + " instance");
		try {
			hibernateTemplate.delete(t);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	@Override
	public T getById(Integer id) {

		log.debug("getting  " + clazz.getSimpleName() + " instance with id: "
				+ id);
		try {
			T t = hibernateTemplate.get(clazz, id);
			return t;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		String className = clazz.getSimpleName();
		log.debug("finding all " + className + " instances");
		try {
			String queryString = "FROM " + className;
			List<T> find = (List<T>) hibernateTemplate.find(queryString, null);
			return find;
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}

	}

	public int getCount() {
		Long count;
		String className = clazz.getSimpleName();
		count = (Long) hibernateTemplate
				.find("select count(*)  FROM " + className).iterator().next();
		return count.intValue();
	}

	@Override
	public void deleteById(Integer id) {
		log.debug("deleting  " + clazz.getSimpleName() + " instance with id: "
				+ id);
		try {
			hibernateTemplate.delete(hibernateTemplate.get(clazz, id));
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}

	}

	/**
	 * 使用hql 语句进行操作
	 * 
	 * @param hql
	 * @param offset
	 * @param length
	 * @return List
	 */
	@SuppressWarnings("unchecked")
	public List<T> getListForPage(final String hql, final int offset,
			final int length) {

		List<T> list = (List<T>) hibernateTemplate
				.execute(new HibernateCallback<Object>() {
					@Override
					public Object doInHibernate(Session arg0)
							throws HibernateException {
						Query query = arg0.createQuery(hql);
						query.setFirstResult(offset);
						query.setMaxResults(length);
						List<T> list = query.list();
						return list;
					}
				});

		return list;
	}

	/**
	 * 使用criterion进行操作
	 * 
	 * @param arg
	 * @param criterions
	 * @param offset
	 * @param length
	 * @return List
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<T> getListForPage(final Criterion[] criterions,
			final int offset, final int length) {
		List<T> list = hibernateTemplate.execute(new HibernateCallback() {
			public Object doInHibernate(Session session)
					throws HibernateException {
				Criteria criteria = session.createCriteria(clazz);
				// 循环遍历添加约束条件
				for (int i = 0; i < criterions.length; i++) {
					criteria.add(criterions[i]);
				}
				criteria.setFirstResult(offset);
				criteria.setMaxResults(length);
				return criteria.list();
			}
		});
		return list;
	}

	@Override
	public T merge(T t) {
		log.debug("merging " + clazz.getSimpleName() + " instance");
		try {
			T result = hibernateTemplate.merge(t);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public List<T> findByProperty(String propertyName, Object value) {
		String simpleName = clazz.getSimpleName();
		log.debug("finding " + simpleName + " instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from " + simpleName
					+ " as model where model." + propertyName + "= ?";
			List<T> find = (List<T>) hibernateTemplate.find(queryString, value);
			return find;
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	@Override
	public Object findObjectBySql(String sql, Object... params) {
		log.debug("findObjectBySql: " + sql);
		Object uniqueResult;
		try {
			Query query = fillQueryByPosition(hibernateTemplate
					.getSessionFactory().getCurrentSession().createQuery(sql),
					params);
			uniqueResult = query.uniqueResult();

		} catch (RuntimeException re) {
			log.error("findObjectBySql failed", re);
			throw re;
		}

		return uniqueResult;
	}

	/**
	 * 根据下标填充query
	 * 
	 * @param query
	 *            query
	 * @param params
	 *            参数
	 * @return query
	 */
	public Query fillQueryByPosition(Query query, Object... params) {

		if (params != null) {
			for (int i = 0; i < params.length; i++) {
				if (null != params[i]) {
					query.setString(i, params[i].toString());
				} else {
					query.setString(i, null);
				}
			}
		}

		return query;

	}

	@Override
	public List<T> getListByHQL(String hql, Object... params) {
		log.debug("getListByHQL : " + hql + "  the params is:"
				+ params.toString());
		List<T> find = null;
		try {
			find = (List<T>) hibernateTemplate.find(hql, params);
		} catch (RuntimeException re) {
			log.error("getListByHQL failed", re);
			throw re;
		}
		return find;
	}

	@Override
	public void executeHqlForUpdate(String hql, Object... params) {
		log.debug("executeHqlForUpdate : " + hql + "  the params is:"
				+ params.toString());
		try {
			Query createQuery = this.hibernateTemplate.getSessionFactory()
					.openSession().createQuery(hql);
			createQuery = fillQueryByPosition(createQuery, params);
			createQuery.executeUpdate();
		} catch (RuntimeException re) {
			log.error("getListByHQL failed", re);
			throw re;
		}

	}

	@Override
	public void deleteById(Short id) {
		log.debug("deleting  " + clazz.getSimpleName() + " instance with id: "
				+ id);
		try {
			hibernateTemplate.delete(hibernateTemplate.get(clazz, id));
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}

	}

	@Override
	public void deleteById(Long id) {
		log.debug("deleting  " + clazz.getSimpleName() + " instance with id: "
				+ id);
		try {
			hibernateTemplate.delete(hibernateTemplate.get(clazz, id));
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}

	}

	@Override
	public T getById(Short id) {
		log.debug("getting  " + clazz.getSimpleName() + " instance with id: "
				+ id);
		try {
			T t = hibernateTemplate.get(clazz, id);
			return t;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	@Override
	public T getById(Long id) {
		log.debug("getting  " + clazz.getSimpleName() + " instance with id: "
				+ id);
		try {
			T t = hibernateTemplate.get(clazz, id);
			return t;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

}
