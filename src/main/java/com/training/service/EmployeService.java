package com.training.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.persistance.dao.IEmployeDao;
import com.persistance.model.Employe;
@Service
@Transactional
public class EmployeService implements IEmployeService {
@Autowired
IEmployeDao employeDao;
		
	@Override
	public void add(Employe emp) {
		employeDao.add(emp);
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Employe emp) {
		// TODO Auto-generated method stub
		employeDao.delete(emp);
	}

	@Override
	public List<Employe> findAll() {
		// TODO Auto-generated method stub
		return employeDao.findAll();
	}

	@Override
	public Employe update(Employe emp) {
		// TODO Auto-generated method stub
		return employeDao.update(emp);
	}

	@Override
	public Employe findById(int employeeId) {
		// TODO Auto-generated method stub
		return employeDao.findById(employeeId);
	}

}