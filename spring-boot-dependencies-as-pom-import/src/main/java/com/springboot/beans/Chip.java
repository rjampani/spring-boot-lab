package com.springboot.beans;

import org.springframework.stereotype.Component;

@Component
public class Chip {
	
	protected String chipId;
	protected String ramSize;

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
