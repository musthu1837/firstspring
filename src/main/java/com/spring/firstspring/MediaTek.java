package com.spring.firstspring;

import org.springframework.stereotype.Component;

@Component
public class MediaTek implements MicroProcessor {
	public void process() {
		System.out.println("MediaTek processing...");
	}

}
