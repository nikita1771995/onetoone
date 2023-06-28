package com.cjc.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.Service.HomeService;
import com.cjc.main.model.Employee;

@RestController
public class HomeController {
	
   @Autowired
	HomeService hs;
   
   @PostMapping("/save")
   public List<Employee> SavaData(@RequestBody Employee e)
   {
	   hs.saveData(e);
	   List<Employee>list = new ArrayList<Employee>();
	   list.add(e);
	   return list;
	   
   }
	@GetMapping("/ok")
	public String getData1()
	{
		return "ok";

	}
   @GetMapping("/get")
   public List<Employee> getData(Employee e)
   {
	   //Employee e = new Employee();
	   List<Employee> list=hs.getAllData();
	   for (Employee emp : list) {
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getAddr());
		System.out.println(emp.getMono().getMo_id());
		System.out.println(emp.getMono().getMob_no());
	}
	   list.add(e);
	return list;
	   
   }

   @PutMapping("/update/{id}")
   public List<Employee> updateData(@PathVariable ("id") int id,@RequestBody Employee emp)
   {
	  hs.saveData(emp); 
	  List<Employee>list = new ArrayList<Employee>();
	   list.add(emp);
	   return list;
	   
   }
   @GetMapping("/edit/{id}")
   public Employee editData(@PathVariable ("id") int id )
   {
	   Employee e=hs.editData(id);
	return e;
	   
   }
   
   @DeleteMapping("/delete/{id}")
   public String deleteData(@PathVariable ("id") int id)
   
   {
	   hs.deleteData(id);
	return "delete";
	   
   }
   
   
}
