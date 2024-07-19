package com.example.demo.Response;

import java.time.LocalDateTime;

public class ResponseUtils {
	
	public CommanResponse prepareResponse(Integer status,String message,Object data) {
		return new CommanResponse(LocalDateTime.now(), status, message,data);
	}

}
