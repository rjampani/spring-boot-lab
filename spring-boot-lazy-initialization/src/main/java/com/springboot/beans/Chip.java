package com.springboot.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Chip {
	@Value("${chipId}")
	protected String chipId;
	@Value("${ramSize}")
	protected String ramSize;
	
	public Chip() {
		System.out.println("chip object created...");
	}
	
	public String getChipId() {
		return chipId;
	}
	public void setChipId(String chipId) {
		this.chipId = chipId;
	}
	public String getRamSize() {
		return ramSize;
	}
	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}
	
	
}
