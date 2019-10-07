package com.training.service;

import java.util.List;

import com.persistance.model.Employe;

public interface IEmployeService {
public void add(Employe emp);
public void delete(Employe emp);
public List<Employe> findAll();
public Employe update(Employe emp);
public Employe findById(int employeeId);
}