package com.greatlearning.email_app.lab1;
import java.util.Scanner;
public class EmailIntegration {
	
	public int departmentcode;
	
	public int getDepartmentcode() {
		return departmentcode;
	}

	public void setDepartmentcode(int departmentcode) {
		this.departmentcode = departmentcode;
	}

	public void init() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first name");		
		String firstname = input.nextLine();
		
		System.out.println("Enter your last name");		
		String lastname = input.nextLine();
		
		System.out.println("Enter your department");
		System.out.println("Specify the following department code values");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		 //int departmentCode = input.nextInt();
		 setDepartmentcode(input.nextInt());
		
		CredentialServiceImpl serviceObj = 
				new CredentialServiceImpl();
		if (getDepartmentcode() <=4 && getDepartmentcode() >0 )
		{
		String emailid = serviceObj.genEmailAddress(firstname,
				lastname, getDepartmentcode());
		
		String password = serviceObj.genPassword();
		
		Employee empobj = new Employee(firstname, lastname, emailid);
		empobj.setPassword(password);
		serviceObj.dispGenCredentials(empobj);
		input.close();
		}
		else {
			System.out.println("Dear "+firstname +", Invalid Department Code...!\nChoose the Department Code in Between 1 and 4.\nPlease Try Again....!");
		}
	}
}
