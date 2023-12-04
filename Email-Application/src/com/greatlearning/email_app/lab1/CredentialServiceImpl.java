package com.greatlearning.email_app.lab1;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CredentialServiceImpl implements InCredentialServices {

	@Override
	public String genEmailAddress(String firstName, String lastName, int deptCode) {
			
		String FullStop = ".";
		String at = "@";
		String Company = "mnc.com";
		String deptName = "";
		
		if(deptCode == 1) {
			deptName = "tech";
		}
		else if(deptCode == 2) {
			deptName = "admin";
		}
		else if(deptCode == 3) {
			deptName = "hr";
		}
		else if(deptCode == 4) {
			deptName = "legal";
		}
					
		String emailBuild = firstName.toLowerCase().replaceAll("\\s", "") +
							FullStop+lastName.toLowerCase().replaceAll("\\s", "")
							+at+deptName+FullStop+Company;
		String emailidBuild = emailBuild;
		
		return emailidBuild;
	}

	@Override
	public String genPassword() {
		// TODO Auto-generated method stub
		String Capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Smalls = "abcdefghijklmnopqrstuvwxyz";
		String nums = "0123456789";
		String SpecialChars = "~!@#$%^&*()_+=}{[];:'|/?.>,<";
		StringBuilder PasswordBuild = new StringBuilder();
	
		// 1st category - 2 characters
		for(int index = 1; index <=2; index++)
		{
			java.util.Random randomObj 
			= new java.util.Random();
		
		int randomValue = randomObj.nextInt(Capitals.length());
		char randomCharValue = Capitals.charAt(randomValue);
		PasswordBuild.append(randomCharValue);	
		}
		
		// 2nd category - 2 characters
		for(int index = 1; index <=2; index++)
		{
			java.util.Random randomObj 
			= new java.util.Random();
		
		int randomValue = randomObj.nextInt(Smalls.length());

		char randomCharValue = Smalls.charAt(randomValue);
		PasswordBuild.append(randomCharValue);	
		}
		
		// 3rd category - 2 characters
		for(int index = 1; index <=2; index++)
		{
			java.util.Random randomObj 
			= new java.util.Random();
		
		int randomValue = randomObj.nextInt(SpecialChars.length());
	

		char randomCharValue = SpecialChars.charAt(randomValue);
		PasswordBuild.append(randomCharValue);	
		}
		
		// 4th category - 2 characters
		for(int index = 1; index <=2; index++)
		{
			java.util.Random randomObj 
			= new java.util.Random();
		
		int randomValue = randomObj.nextInt(nums.length());

		char randomCharValue = nums.charAt(randomValue);
		PasswordBuild.append(randomCharValue);	
		}
		String pwd = PasswordBuild.toString();
		// Jumbling password
		List<String> chars = Arrays.asList(pwd.split(""));
		Collections.shuffle(chars);
		String PassWord = "";
		for(String character:chars)
		{
			PassWord = PassWord + character;
		}
		return PassWord;
	}

	@Override
	public void dispGenCredentials(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("Dear " + employee.getFirstname()
		+ ", your generated credentials are as follows");

		System.out.println("Email        --->  " + employee.getEmailID());
		System.out.println("Password     --->  " + employee.getPassword());
	}

}
