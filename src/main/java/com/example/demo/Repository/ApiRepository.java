package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Entity.ApiEntityClass;

public interface ApiRepository extends JpaRepository<ApiEntityClass, Integer>{

	@Query(value = "select employeeid,firstname,lastname from employees where employeeid = :id",nativeQuery = true)
	Object getdataInfo(@PathVariable("id") Integer id);
	
	

}
