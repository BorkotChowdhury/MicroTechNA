package BODH;

public class BOHtoDecimal {

	
	public static void main(String[] args) {
		
		String binary = "1010";
		Integer decimal = Integer.parseInt(binary,2);
		
		System.out.println(decimal);
		
		String octal = "20";
		
		Integer decimal_01 = Integer.parseInt(octal,8);
		System.out.println(decimal_01);
		
		String hexa = "F";
		Integer decimal_02 = Integer.parseInt(hexa,16);
		System.out.println(decimal_02);
		
		}
		}
