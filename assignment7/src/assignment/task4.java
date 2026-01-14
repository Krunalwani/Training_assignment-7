package assignment;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Marks Validation System");
		System.out.println("Enter Marks of Math :");
		int Math = s1.nextInt();
		System.out.println("Enter Marks of Science :");
		int Sci= s1.nextInt();
		System.out.println("Enter Marks of English :");
		int Eng = s1.nextInt();
		

				
				try {
					
					if(Math>100 || Math<0) {
						throw new Markscheck("Enter Valid Marks Of Math In Range 0 to 100");
					}

					else if(Sci>100 || Sci<0) {
						throw new Markscheck("Enter Valid Marks Of Science In Range 0 to 100");
					}

					else if(Eng>100 || Eng<0) {
						throw new Markscheck("Enter Valid Marks Of English In Range 0 to 100");
					}
					System.out.println("Marks  Are saved successfully..");
				}
				catch(Agecheck  ob) {
					ob.printStackTrace();
				}
			}

		}
		class Markscheck extends RuntimeException{
			public Markscheck(String msg) {
				super(msg);
			}
		}
