package greatlearningLab1;

import java.util.Scanner;

import greatlearningLab1.Employee;

public class Driver {
 public static void main(String[] args) {
	 
	 Employee employee = new Employee("Sachin", "Tendulkar");
	 CredentialService cs = new CredentialService();
		 String generatedEmail;
	 char[]generatedPassword;
	 
	 System.out.println("Please enter the department from the following");
	 System.out.println("1. Technical");
	 System.out.println("2. Admin");
	 System.out.println("3. Human Resource");
	 System.out.println("4. Legal");
	 
	 Scanner sc = new Scanner(System.in);
	 int option= sc.nextInt();
	 
	 if(option==1) {
		 generatedEmail= cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(), "Technical");
		 generatedPassword= cs.generatePassword();
		 cs.showCredentials(employee, generatedEmail, generatedPassword);
		 
 }
	 else if(option==2) {
		 generatedEmail= cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(), "Admin");
		 generatedPassword= cs.generatePassword();
		 cs.showCredentials(employee, generatedEmail, generatedPassword);
	 }
	 else if (option==3) {
		 generatedEmail= cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(), "HR");
		 generatedPassword= cs.generatePassword();
		 cs.showCredentials(employee, generatedEmail, generatedPassword);
		  
	 }
	 else if(option==4) {
		 generatedEmail= cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(), "Legal");
		 generatedPassword= cs.generatePassword();
		 cs.showCredentials(employee, generatedEmail, generatedPassword);
	 }
	 else
		 System.out.println("Enter a valid option");
	 sc.close();
 }
}
