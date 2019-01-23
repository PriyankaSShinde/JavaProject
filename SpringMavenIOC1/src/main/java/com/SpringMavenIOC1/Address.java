package com.SpringMavenIOC1;

import org.springframework.beans.factory.annotation.Value;

public class Address {
    @Value("${uloc}")
	private String landmark;

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	@Override
	public String toString() {
		return "Address [landmark=" + landmark + "]";
	}
	
	
}
