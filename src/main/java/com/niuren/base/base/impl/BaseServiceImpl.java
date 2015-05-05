package com.niuren.base.base.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.test.annotation.Rollback;

import com.niuren.base.base.BaseDao;
import com.niuren.base.base.BaseService;

@Transactional
public class BaseServiceImpl<K, T> implements BaseService<K, T> {

	@Autowired
	private BaseDao<T> baseDao;

	@SuppressWarnings("unchecked")
	public BaseServiceImpl() {
		ParameterizedType pt = (ParameterizedType) this.getClass()
				.getGenericSuperclass();

		Class<T> clazz = (Class<T>) pt.getActualTypeArguments()[0];

		try {
			baseDao = (BaseDao<T>) clazz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void insert(T t) {
		baseDao.insert(t);
	}

	@Override
	@Rollback(false)
	public void update(T t) {
		baseDao.update(t);
	}

	@Override
	@Rollback(false)
	public void delete(T t) {

		baseDao.delete(t);
	}

	@Override
	public T getById(Integer id) {
		System.out.println("-------");
		T t = baseDao.getById(id);
		System.out.println("+++++");
		return t;
	}

	@Override
	public List<T> findAll() {
		//
		return baseDao.findAll();
	}

	@Override
	public void deleteById(Integer id) {
		baseDao.deleteById(id);
	}

	@Override
	public List<T> getListForPage(String hql, int offset, int length) {
		return baseDao.getListForPage(hql, offset, length);
	}

	@Override
	public int getCount() {

		return baseDao.getCount();
	}

	@Override
	public List<T> findByProperty(String propertyName, Object value) {

		return baseDao.findByProperty(propertyName, value);
	}

	@Override
	public Object findObjectBySql(String sql, Object... params) {
		//
		return baseDao.findObjectBySql(sql, params);
	}

	@Override
	public List<T> getListByHQL(String hql, Object... params) {

		return baseDao.getListByHQL(hql, params);
	}

	@Override
	public void executeHqlForUpdate(String hql, Object... params) {

		baseDao.executeHqlForUpdate(hql, params);

	}

	@Override
	public void deleteById(Short id) {
		baseDao.deleteById(id);

	}

	@Override
	public void deleteById(Long id) {
		baseDao.deleteById(id);

	}

	@Override
	public T getById(Short id) {
		return baseDao.getById(id);
	}

	@Override
	public T getById(Long id) {
		return baseDao.getById(id);
	}

}
