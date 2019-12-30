package com.spring.firstspring;

public class SnapDragon implements MicroProcessor {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void process() {
		System.out.println("SnapDragon processing...");
	}
}
