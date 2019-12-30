package com.spring.firstspring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SnapDragon implements MicroProcessor {
	public void process() {
		System.out.println("SnapDragon processing...");
	}
}
