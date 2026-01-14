 package assignment;
 import java.util.Scanner;
 

public class task2 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Your  Age :");
		int age = s1.nextInt();
		

				
				try {
					
					if(age<21 || age>38) {
						throw new Agecheck("Invalid age! Registration allowed only between 21 and 35.");
					}
					System.out.println("Registration Successful. You are eligible.");
				}
				catch(Agecheck  ob) {
					ob.printStackTrace();
				}
			}

		}
		class Agecheck extends RuntimeException{
			public Agecheck(String msg) {
				super(msg);
			}
		}

			

	
