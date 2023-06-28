package com.cjc.main.Service;

import java.util.List;

import com.cjc.main.model.Employee;


public interface HomeService {
	
	public void saveData (Employee emp);
    public List<Employee> getAllData();
    public Employee editData(int id);
    public Employee deleteData(int id);
   // public Employee updateData(int id);
	//Employee updateData(Employee emp);
	//public void saveData(Employee emp);
}
 