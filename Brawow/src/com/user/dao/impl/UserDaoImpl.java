package com.user.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;





import com.user.dao.UserDao;
import com.user.entity.TUser;

public class UserDaoImpl implements UserDao {
	
	/*private SessionFactory sessionFactory;
	
	@Override
	public List<TUser> findUserByUser(String id, String t_name) {
		
		String hql = "From TUser u where u.id='"+id+"' and u.t_name = '"+t_name+"'";
		System.out.println("===================="+hql);
		 //Session session = sessionFactory.getCurrentSession();
         Session session = sessionFactory.openSession();
         Query query = session.createQuery(hql);
         return query.list();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}*/

}
