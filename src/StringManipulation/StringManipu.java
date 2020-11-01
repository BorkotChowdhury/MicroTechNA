package StringManipulation;

public class StringManipu {

	public static void main(String[] args) {
		
		//creating s String by java string literal
		
		String str = "Beginnersbook";
		
		
		char arrch[]= {'h','e','l','l','o'};
		
		//converting char array arrch[] to string str2
		String str2 = new String(arrch);
		
		//creating another java string str3 by using new keyword
		
		String str3 = new String ("Java String Example");
		
		//display all the three strings
		System.out.println("\n" +str);
		System.out.println("\n" +str2);
		System.out.println("\n" +str3);
		}
		}
