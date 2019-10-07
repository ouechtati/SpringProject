package com.persistance.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.persistance.model.Employe;





@Repository
public class EmployeDao implements IEmployeDao {
	
	@Autowired
	SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void add(Employe emp) {
		sessionFactory.getCurrentSession().save(emp);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employe> findAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Employe").list();
	}

	@Override
	public void delete(Employe emp) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(emp);
	}

	@Override
	public Employe update(Employe emp) {
		// TODO Auto-generated method stub
		 sessionFactory.getCurrentSession().update(emp);
		 return emp;
	}

	@Override
	public Employe findById(int id) {
		// TODO Auto-generated method stub
		return  (Employe) sessionFactory.getCurrentSession().get(Employe.class,id);
	}

}