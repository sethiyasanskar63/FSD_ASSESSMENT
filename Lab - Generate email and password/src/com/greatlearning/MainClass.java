package com.greatlearning;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Company Name:");
		String company=sc.nextLine();
		System.out.println("Enter First Name:");
		String firstName=sc.nextLine();
		System.out.println("Enter First Name:");
		String lastName=sc.nextLine();
		System.out.println("Please select department from the following:");
		System.out.println("1 -> Technical\n2 -> Admin\n3 -> Human Resource\n4 -> Legal");
		int dept=sc.nextInt();
		String department="";
		switch (dept) {
		case 1: department="tech";break;
		case 2: department="admin";break;
		case 3: department="hr";break;
		case 4: department="legal";break;
		default: System.out.println("Wrong input!"); System.exit(0);
		}
		sc.close();
		
		Employee employee=new Employee(firstName,lastName,department,company);
		
		CredentialService genCre=new CredentialService();
		genCre.generateEmailAddress(employee);
		genCre.generatePassword(employee);
		
		System.out.println("Dear "+employee.firstName+" your generated credentials are as follows:");
		
		genCre.showCredentials(employee);

	}

}
