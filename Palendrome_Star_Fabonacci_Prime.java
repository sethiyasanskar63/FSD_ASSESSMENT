import java.util.Scanner;

public class Palendrome_Star_Fabonacci_Prime {
	
	Scanner sc = new Scanner(System.in);
	
	//function to checkPalindrome
	public void checkPalindrome()  {
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		sc.close();
		if (num<0) num*=-1;
		String nums=""+num;
		String reverse="";
		while(num>0) {
			int x=num%10;
			reverse+=x;
			num=num/10;
		}
		if (nums.equals(reverse)) System.out.println("The number is palindrome");
		else System.out.println("The number is not palindrome");

    }
	
	//function to printPattern
	public void printPattern() {
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		sc.close();
		for (int i=num;i>0;i--) {
			for (int j=i;j>0;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
    }
	
	//function to check no is prime or not
	public void checkPrimeNumber() {
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		sc.close();
		int factors=0;
		for (int i=2;i<num;i++) {
			if (num%i==0) {
				factors++;
			}
		}
		if (factors !=0) System.out.println("The number is not a prime number.");
		else System.out.println("The number is a prime number.");
		
    }  
	
	// function to print Fabonacci Series
	public void printFibonacciSeries() {
		
		//initialize the first and second value as 0,1 respectively.
		System.out.println("Enter the length of Fabonacci Series:");
		int num=sc.nextInt();
		int n=1, next=0,prev=0;
		sc.close();
		System.out.println(0);
		while (num>0) {
			System.out.println(next);
			prev=n;
			n=next;
			next=n+prev;
			num-=1;
		}
	}
	
	//main method which contains switch and do while loop
	public static void main(String[] args) {
		
		Palendrome_Star_Fabonacci_Prime obj = new Palendrome_Star_Fabonacci_Prime();
		Scanner sc = new Scanner(System.in);
		
		int choice;
		do {

			System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

			+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

			+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
			System.out.println();
			choice = sc.nextInt();
			switch (choice) {
			
			case 0:{
				choice = 0;
				break;
			}
			
			case 1:{
				obj.checkPalindrome();
				break;
			}
			
			case 2:{
				obj.printPattern();
				break;
			}
			
			case 3:{
				obj.checkPrimeNumber();
				break;
			}
			
			case 4:{
				obj.printFibonacciSeries();
				break;
			}
			
			default:{
				System.out.println("Invalid choice. Enter a valid no.\n");
			}
			
			}
		} while (choice != 0);
		
		System.out.println("Exited Successfully!!!");
		sc.close();
	}
}