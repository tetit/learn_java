package com.itbulls.learnit.javacore.enumerations.hw;
import static  com.itbulls.learnit.javacore.enumerations.hw.Priority.*;

public enum MessageType2 {
	A(HIGH), B(MEDIUM), C(LOW), D(LOW);
	
	private Priority priority;

	private MessageType2(Priority priority) {
		this.priority = priority;
	}

	public Priority getPriority() {
		return this.priority;
	}


}
