package com.swabhav.exceptions.checked.test;

import com.swabhav.exceptions.checked.EmailNotUniqueException;
import com.swabhav.exceptions.checked.RegistrationService;

public class CheckedExceptionsTest {
	public static void main(String[] args) {
		RegistrationService service = new RegistrationService();
		
		try {
			service.validateEmail("abc@gmail.com");
		} catch (EmailNotUniqueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
