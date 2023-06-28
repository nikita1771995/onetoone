package com.cjc.main.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.Service.HomeService;
import com.cjc.main.model.Employee;
import com.cjc.main.repository.Repository;


@Service
public class ServiceImpl implements HomeService {

	@Autowired
	Repository hr;
	@Override
	public void saveData(Employee emp) {
	
		hr.save(emp);
		System.out.println("Successfully save");
	}
	
	@Override
	public List<Employee> getAllData() {
		List<Employee> list=(List<Employee>) hr.findAll();
		
		return list;
	}

	@Override
	public Employee editData(int id) {
		Employee emp=hr.findAllById(id);
		return emp;
	}

	@Override
	public Employee deleteData(int id) {
		hr.deleteById(id);
		return null;
	}

//	@Override
//	public void updateData(Employee emp) {
//		hr.saveAll(emp);
//		
//	}

	

	
	
}
