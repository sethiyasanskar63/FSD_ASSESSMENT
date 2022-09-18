package com.greatlearning;
import java.util.Random;

public class CredentialService extends Employee {
	
	public void generatePassword(Employee emp) {
		
		Random rand = new Random();
		
		String upperCaseCharacters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseCharacters="abcdefghijklmnopqrstuvwxyz";
		String specialCharacer="!@#$&";
		String number="0123456789";
		String everything=upperCaseCharacters+lowerCaseCharacters+specialCharacer+number;
		
		String password="";
		
		int n=(int) ((Math.random() * (10 - 5)) + 5);//to get a random length of password
		password+=upperCaseCharacters.charAt(rand.nextInt(25));
		password+=lowerCaseCharacters.charAt(rand.nextInt(25));
		password+=number.charAt(rand.nextInt(9));
		password+=specialCharacer.charAt(rand.nextInt(4));
		
		for (int i=4;i<n;i++) {
			password+=everything.charAt(rand.nextInt(66));
		}
		
		
		emp.setPassword(password);
		
	}
	
	public void generateEmailAddress(Employee emp) {
		String email=emp.firstName.toLowerCase()+"."+emp.lastName.toLowerCase()+"@"+emp.department+"."+emp.company+".com";
		emp.setEmail(email);
	}
	
	public void showCredentials(Employee emp) {
		System.out.println("Email----> "+emp.getEmail());
		System.out.println("Password-> "+emp.getPassword());
	}
	
}
