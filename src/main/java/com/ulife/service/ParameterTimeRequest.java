package com.ulife.service;


public class ParameterTimeRequest {

	private Integer time;
	
	public ParameterTimeRequest(){
		
	}
	
	public ParameterTimeRequest(Integer time){
		this.time = time;
	}
	
	@Override
	public String toString(){
		return "time:" + this.time;
	}

	public Integer getTime() {
		return time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}
	
	
}
