package com.greatlearning.email_app.lab1;

public interface InCredentialServices {
		String genEmailAddress(String firstName, String lastName, int deptCode);
		String genPassword();
		void dispGenCredentials(Employee employee);
}
