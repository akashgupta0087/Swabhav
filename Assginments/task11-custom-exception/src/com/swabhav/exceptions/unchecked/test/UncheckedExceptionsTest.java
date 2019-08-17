package com.swabhav.exceptions.unchecked.test;

import com.swabhav.exceptions.unchecked.*;

public class UncheckedExceptionsTest {
	public static void main(String[] args) {
		RegistrationService service = new RegistrationService();
		service.validateEmail("abc@gmail11.com");
	}

	}


