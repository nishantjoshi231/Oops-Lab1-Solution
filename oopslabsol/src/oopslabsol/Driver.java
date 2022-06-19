package oopslabsol;


import java.util.Scanner;

import CredentialService.CredentialService;
import oppslabsol.models.*;

public class Driver {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the First Name");
		String fname=scan.next();
		System.out.println("Enter the Last Name");
		String lname=scan.next();
		
		Employee emp=new Employee(fname,lname);
	int input;
	
			
	String Department="";
	int n=0;
	do {	
		n=0;
    System.out.print("1. Technical\n"
    		+"2. Admin\n"
    		+"3. Human Resource\n"
    		+"4. Legal\n");
    
      input=scan.nextInt();
     
    
    
     switch(input) {
     case 1: 
    	 Department="Technical";
     	break;
     case 2:
    	Department="Admin";
    	 break;
     case 3:
    	Department="Human Resource";
    	 break;
     case 4:
    	 Department="Legal";
    	 break;
    	 default:
    		  n=9;
    		 System.err.println("Invalid Selection");
     }
	}while(n == 9);
     scan.close();

	CredentialService cred= new CredentialService();
	String GeneratedEmail=cred.generateEmailAddress(fname, lname, Department).toLowerCase();
	
	String generatedPassword=cred.generatePassword();

	cred.showCredentials(emp, GeneratedEmail, generatedPassword);
	
}
}