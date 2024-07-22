package com.example.demo.Response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CommanResponse {
	
	public LocalDateTime date;
	public Integer status;
	public String message;
	public Object data;

}
