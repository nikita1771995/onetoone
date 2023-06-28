package com.cjc.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.cjc.main.model.Employee;


public interface Repository extends CrudRepository<Employee, Integer>  {
	
	public Employee findAllById(int id);

	//public void saveAll(Employee emp);

}
