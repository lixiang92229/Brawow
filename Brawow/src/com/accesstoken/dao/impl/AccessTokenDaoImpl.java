package com.accesstoken.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.accesstoken.dao.AccessTokenDao;
import com.accesstoken.entity.TAccessToken;

public class AccessTokenDaoImpl implements AccessTokenDao {

	private SessionFactory sessionFactory;

	@Override
	public List<TAccessToken> findwxaccesstoken() {
		String hql = "From TAccessToken u ";
		System.out.println("====================" + hql);
		// Session session = sessionFactory.getCurrentSession();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(hql);
		return (List<TAccessToken>) query.list();
	}

	@Override
	public boolean setwxaccesstoken(TAccessToken accesstoken) {
		int id=-1;
		 id = (int) sessionFactory.getCurrentSession().save(accesstoken);
		if (id!=-1) {
			return true;
		} else {
			return false;
		}
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
