package com.persistance.dao;

import java.util.List;

import com.persistance.model.Employe;

public interface IEmployeDao {
public void add(Employe emp);
public List<Employe> findAll();
public void delete(Employe emp);
public Employe update(Employe emp);
public Employe findById(int id);
}