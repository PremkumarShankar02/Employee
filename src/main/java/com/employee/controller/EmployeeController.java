package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.EmployeeEntity;
import com.employee.exception.NameException;
import com.employee.exception.SalaryException;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
	@Autowired
	EmployeeService empser;
	
	@PostMapping(value="/insert")
	public String addEmployee(@RequestBody EmployeeEntity e) throws SalaryException {
		return empser.addEmployee(e);
	}
	@PostMapping(value="/create")
	public String employeeDetails(@RequestBody List<EmployeeEntity> e1){
		return empser.employeeDetails(e1);
	}
	@GetMapping(value="/retrive/{a}")
	public EmployeeEntity getDetails(@PathVariable int a) {
		return empser.getDetails(a);
		
	}
	@GetMapping(value="/ret")
	public List<EmployeeEntity> getAll(){
		return empser.getAll();
	}
	@DeleteMapping(value="/delete/{a}")
	public String deleteEmp(@PathVariable int a) {
		return empser.deleteEmp(a);
	}
	@PutMapping(value="/update")
	public String updateEmp(@RequestBody EmployeeEntity a) {
		return empser.updateEmp(a);
	}
	@GetMapping(value="/maxsal/{a}")
	public List<EmployeeEntity> findMax(@PathVariable int a) {
		return empser.findMax(a);
	}
	@GetMapping(value="/max")
	public EmployeeEntity max(){
		return empser.max();
	}
	@GetMapping(value="/min")
	public EmployeeEntity min() {
		return empser.min();
	}
	@GetMapping(value="/incre/{a}")
	public List<EmployeeEntity> salIncre(@PathVariable String a) {
		return empser.salIncre(a);
	}
	@GetMapping(value="/name/{a}")
	public List<EmployeeEntity> findName(@PathVariable String a){
		return empser.findName(a);
	}
	@GetMapping(value="/gen/{a}")
	public List<EmployeeEntity> findGen(@PathVariable String a){
		return empser.findGen(a);
	}
	@GetMapping(value="nam/{a}")
	public List<String> findNam(@PathVariable String a){
		return empser.findNam(a);
		
	}
	@GetMapping(value="setbysal/{sal1}/{sal2}")
	public List<EmployeeEntity> getBySal(@PathVariable int sal1,@PathVariable int sal2) {
		return empser.getBySal(sal1,sal2);
	}
@GetMapping(value="getbyid/{a}/{b}")
public List<EmployeeEntity> getbyId(@PathVariable int a,@PathVariable int b){
	return empser.getbyId(a,b);
}
@GetMapping(value="/names/{a}")
public List<EmployeeEntity> findNames(@PathVariable String a) throws NameException {
	return empser.findNames(a);
}
@GetMapping(value="/getId/{a}")
public  EmployeeEntity getById(@PathVariable int a) {
	return empser.getById(a);
	
}


}
