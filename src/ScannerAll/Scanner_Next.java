package ScannerAll;

import java.util.Scanner;

public class Scanner_Next {

	public static void main(String[] args) {
		System.out.println("Please Enter your name : ");
		Scanner scan = new Scanner (System.in);
		 String s = scan.next();
		 System.out.println( "Your name is : "+s);
		 
		 Scanner y = new Scanner (System.in);
		 System.out.println("Enter day : ");
		 String z = String.valueOf(y.nextLine());
		 if (z.equals("Saterday")) {
			 System.out.println("Go to Class");
		 }
		 else {System.out.println("No Class today");
		 
		 	}
			}
			}
