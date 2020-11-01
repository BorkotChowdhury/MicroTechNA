package StringManipulation;

public class StringTrim {

	public static void main(String[] args) {
	
		String s1 = "  Hello string   ";
		
		System.out.println("------------------------------");
		System.out.println(s1 + "javapoint");// without trim ()
		System.out.println("------------------------------");
		System.out.println(s1.trim() + "javapoint");// with trim(
		
		
	String s2 = "  Hello java String    ";
	System.out.println(s2.length());
	System.out.println(s2);// without trim()
	
	String tr = s2.trim();
	System.out.println(tr.length());
	System.out.println(tr);//with trim() }
	}
	}
