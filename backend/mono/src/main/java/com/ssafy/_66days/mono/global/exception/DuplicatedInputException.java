package com.ssafy._66days.mono.global.exception;

public class DuplicatedInputException extends RuntimeException {
	private static final long serialVersionUID = 2238030302650813810L;
	
	public DuplicatedInputException(String msg) {
		super(msg);
	}
}
