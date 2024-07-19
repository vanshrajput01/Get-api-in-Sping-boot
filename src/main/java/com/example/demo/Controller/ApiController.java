package com.example.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Response.ApplicationConstraints;
import com.example.demo.Response.CommanResponse;
import com.example.demo.Response.ResponseUtils;

@RestController
public class ApiController {
	
	@Autowired
	private ResponseUtils responseUtils;
	
	@GetMapping("/Api/getdata/{userid}")
	public ResponseEntity<CommanResponse> getData(@PathVariable(value = "userid") Integer id){
		return new ResponseEntity<>(responseUtils.prepareResponse(HttpStatus.OK.value(),ApplicationConstraints.SUCCESS_MSG,this.apiService.getData(id)));
	}

}
