package CredentialService;

import java.util.Random;

import oppslabsol.models.*;

public class CredentialService {
	
            
	public String generateEmailAddress(String firstName, String lastName,String department) {
		return firstName+lastName+"@"+department+".abc.com";
	}
	
	public String generatePassword() {
		String Upper="ABCDEFGHIJKLMNOPQRTUVWXYZ";
		String Lower="abcdefghijklmnopqrstuvwxyz";
		String Num="1234567890";
		String Special="!@#$%^&*()~{}[]|:';,.?";
		String Combination=Upper+Lower+Num+Special;
		
		int len=8;
		char[] pass=new char[len];
		Random r=new Random();
		for(int i=0;i<len;i++) {
			pass[i]=Combination.charAt(r.nextInt(Combination.length()));
		}
		String Password= new String(pass);
		return Password;
	}
	
	public void showCredentials(Employee employee,String EmailAddress,String Password) {
		System.out.println("Dear "+employee.getFirstName()+ " your generated Credentials are");
		System.out.println("Email -------->"+ EmailAddress);
		System.out.println("Password ------->"+ Password);
		
	}

}
