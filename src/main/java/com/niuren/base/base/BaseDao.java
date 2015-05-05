package com.niuren.base.base;

import java.util.List;

import org.hibernate.criterion.Criterion;

public interface BaseDao<T> {

	public void insert(T t);

	public T update(T t);

	public void delete(T t);

	public void deleteById(Integer id);

	public void deleteById(Short id);

	public void deleteById(Long id);

	public T getById(Integer id);

	public T getById(Short id);

	public T getById(Long id);

	public List<T> findAll();

	public T merge(T t);

	public List<T> getListForPage(final String hql, final int offset,
			final int length);

	int getCount();

	List<T> getListForPage(final Criterion[] criterions, final int offset,
			final int length);

	List<T> findByProperty(String propertyName, Object value);

	Object findObjectBySql(String sql, Object... params);

	List<T> getListByHQL(String hql, Object... params);

	void executeHqlForUpdate(String hql, Object... params);

}
