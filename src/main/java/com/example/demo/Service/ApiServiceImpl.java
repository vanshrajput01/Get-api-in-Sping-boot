package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.ApiRepository;


@Service
public class ApiServiceImpl implements ApiService{
	
	@Autowired
	private ApiRepository apiRepo;

	@Override
	public Object getData(Integer id) {
		return this.apiRepo.getdataInfo(id);
	}

}
