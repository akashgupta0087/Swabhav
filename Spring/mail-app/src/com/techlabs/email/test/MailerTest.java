package com.techlabs.email.test;

import com.techlabs.email.Mailer;

public class MailerTest {
	
	public static void main(String[] args) {
		Mailer.send("akashgupta0087@gmail.com","kannan@swabhavtechlabs.com", "Test mail using TLS", "Hello Sir!! \n This is a Test mail.");
	}

}
