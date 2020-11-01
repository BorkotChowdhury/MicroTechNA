package BODH;

public class XOR {

	public static void main(String[] args) {
		
		boolean x = false;
		boolean y = false;
		boolean xXorY = x^y;
		
		System.out.println("--------------------------");
		System.out.println("false XOR false : "+xXorY);
		System.out.println("--------------------------");
		
		x = false;
		y= true;
		xXorY = x^y;
		
		System.out.println("false XOR true : "+ xXorY);;
		System.out.println("--------------------------");
		
		x = true;
		y = false;
		xXorY = x^ y;
		System.out.println("true XOR false : "+ xXorY);
		System.out.println("--------------------------");
		
			
		x = true;
		y = true;
		xXorY = x^ y;
		
		System.out.println("true XOR true : "+xXorY);
		System.out.println("--------------------------");
		
		String str1 = "1010100101";
		String str2 = "1110000101";
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i<str1.length(); i++) {
			sb.append(str1.charAt(i)^str2.charAt(i));
			}
		System.out.println("This is String Buffer result : "+sb);
		
	}
}
