package com.spring.firstspring;

public class Nokia implements MobilePhone {
	private MicroProcessor processor;
	
	public MicroProcessor getProcessor() {
		return processor;
	}
	
	public void setProcessor(MicroProcessor processor) {
		this.processor = processor;
	}
	
	@Override
	public String toString() {
		return "Nokia [processor=" + processor + "]";
	}

	public void makeCall() {
		// TODO Auto-generated method stub
//		processor.process();
		System.out.println("making call via Nokia.......");
	}
}
