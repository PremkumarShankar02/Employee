package com.employee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.employee.entity.EmployeeEntity;
import com.employee.exception.NameException;
import com.employee.repositary.EmployeeRepositary;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepositary empRepo;
	public String addEmployee(EmployeeEntity e) {
		empRepo.save(e);
		return "Saved Successfully";
	}
	public String employeeDetails(List<EmployeeEntity> e1) {
		empRepo.saveAll(e1);
		return "Added Successfully";
	}
	public EmployeeEntity getDetails(int a) {
		return empRepo.findById(a).get();
	}
	public List<EmployeeEntity> getAll() {
		return empRepo.findAll();
	}
	public String deleteEmp(int a) {
		empRepo.deleteById(a);
		return "Deleted Successfully";
		}
	public String updateEmp(EmployeeEntity a) {
		empRepo.save(a);
		return "Updated Successfully";
	}
	public List<EmployeeEntity> getBySal( int sal1,int sal2){
		return empRepo.getBySal(sal1, sal1);
		
	}
	public List<EmployeeEntity> getbyId(int a,int b){
		return empRepo.getById(a,b);
	}
	public  EmployeeEntity getById(int a) {
		return empRepo.findById(a).get();
	}

}
