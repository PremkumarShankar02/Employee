package com.employee.repositary;

import java.util.List;

import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.employee.entity.EmployeeEntity;

public interface EmployeeRepositary extends JpaRepository<EmployeeEntity,Integer> {
	@Query(value="select * from employees_details where salary>=? and salary<=?", nativeQuery=true)
	public List<EmployeeEntity> getBySal(int sal1,int sal2);

	@Query(value="select e from EmployeeEntity e where e.id>:a and e.id<=:b")
	public List<EmployeeEntity> getById(@Param (value="a") int c,@Param (value="b") int d);
	
}
	