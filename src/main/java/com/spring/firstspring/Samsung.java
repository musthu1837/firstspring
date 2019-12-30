package com.spring.firstspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Samsung implements MobilePhone {
	@Autowired
	private MicroProcessor processor;
	
	public void makeCall() {
		// TODO Auto-generated method stub
//		processor.process();
		System.out.println("making call via Samsung.......");
	}
	
	public MicroProcessor getProcessor() {
		return processor;
	}
	
	public void setProcessor(MicroProcessor processor) {
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Samsung [processor=" + processor + "]";
	}
}
