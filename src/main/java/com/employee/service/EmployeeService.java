package com.employee.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.employee.dao.EmployeeDao;
import com.employee.entity.EmployeeEntity;
import com.employee.exception.NameException;
import com.employee.exception.SalaryException;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao empDao;
	public String addEmployee(EmployeeEntity e) throws SalaryException {
		try {
		if(e.getSalary()<23000) {
			throw new SalaryException("Less Salary") ;
		}
		else {
			return empDao.addEmployee(e);
		}}
		catch(SalaryException se) {
			return se.getMessage();
			
		}
	}
	public String employeeDetails(List<EmployeeEntity> e1) {
		return empDao.employeeDetails(e1);
	}
	public EmployeeEntity getDetails(int a) {
		return empDao.getDetails(a);
	}
	public List<EmployeeEntity> getAll(){
	return empDao.getAll();
	}
	public String deleteEmp(int a) {
		return empDao.deleteEmp(a);
	}
	public String updateEmp(EmployeeEntity a) {
		return empDao.updateEmp(a);
	}
	public List<EmployeeEntity> findMax(int a){
		List<EmployeeEntity> sal=this.getAll();
		
	return	sal.stream().filter(x->x.getSalary()>=a).collect(Collectors.toList());
		
			}
	public EmployeeEntity max(){
		List<EmployeeEntity> s=this.getAll();
		return s.stream().max(Comparator.comparingInt(EmployeeEntity::getSalary)).get();
	}
	public EmployeeEntity min() {
		List<EmployeeEntity> m=this.getAll();
		return m.stream().min(Comparator.comparing(EmployeeEntity::getSalary)).get();
	}
	public List<EmployeeEntity> salIncre(String a) {
		List<EmployeeEntity> e=this.getAll();
		return e.stream().filter(x->x.getDesignation().equalsIgnoreCase(a)).peek(x->x.setSalary((x.getSalary()+(x.getSalary()*5/100)))).collect(Collectors.toList());
	}
	public List<EmployeeEntity> findName(String a){
		List<EmployeeEntity> e=this.getAll();
		return e.stream().filter(x->x.getName().equalsIgnoreCase(a)).collect(Collectors.toList());
	}
	public List<EmployeeEntity> findGen(String a){
		List<EmployeeEntity> e=this.getAll();
		return e.stream().filter(x->x.getGender().equalsIgnoreCase(a)).collect(Collectors.toList());
	}
	public List<String> findNam(String a){
		List<EmployeeEntity> e=this.getAll();
		return e.stream().filter(x->x.getName().contains(a)).map(x->x.getName()).collect(Collectors.toList());
	}
	public List<EmployeeEntity> getBySal( int sal1,int sal2){
		return empDao.getBySal(sal1,sal2);
	}
	public List<EmployeeEntity> getbyId(int a,int b){
		return empDao.getbyId(a,b);
	}
	public List<EmployeeEntity> findNames(String a) throws NameException {
		List<EmployeeEntity> e=this.getAll().stream().filter(x->x.getName().equalsIgnoreCase(a)).collect(Collectors.toList());
		if(e.isEmpty()) {
			throw new NameException();
		}
		else {
			return e;
		}
			}
	public  EmployeeEntity getById(int a) {
	return empDao.getById(a);
	}
	
	}

