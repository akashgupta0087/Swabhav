package com.swabhav.exceptions.unchecked;

public class DomainNotValidException extends RuntimeException {
	public DomainNotValidException(String message) {
        super(message);
	}

}
