package greatlearningLab1;

import java.util.Random;

import greatlearningLab1.Employee;

public class CredentialService {

		public char[] generatePassword() {
			String capitalLetters= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String smallLetters= "abcdefghijklmnopqrstuvwxyz";
			String numbers="0123456789";
			String specialCharacters = "!@#$%^&*_+=-/.?<>";
			
			String values= capitalLetters + smallLetters +numbers + specialCharacters;
			
			Random random = new Random();
			
			char[] password = new char[8];
			
			for (int i=0; i<8; i++) {
				
				password[i] = values.charAt(random.nextInt(values.length()));
			}
			return password;
		}
	public String generateEmailAddress(String firstName, String lastName, String department)
	{
		return firstName+lastName+"@"+department+".abc.com";

	}
	public void showCredentials(Employee employee, String email, char[] generatedPassword) {
		System.out.println("Dear "+employee.getFirstName()+ "your generated credentials are as follows");
		System.out.println("email-->"+ email);
		System.out.println("Password--> 1"+"");
		System.out.println(generatedPassword);
	}
	}






