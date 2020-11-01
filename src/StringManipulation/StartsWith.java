package StringManipulation;

public class StartsWith {

	public static void main(String[] args) {
		String s = "  Hossain";
		System.out.println(s);// Hossain without trim
		System.out.println(s.trim());// Hossain with trim
		
		
		String s1 = "Hossain";
		System.out.println(s1.startsWith("Sa"));//true
		System.out.println(s1.endsWith("n"));//true
		
		String s2 = "Hossain";
		System.out.println(s.charAt(0));//S
		System.out.println(s2.charAt(3));//h
		System.out.println(s2.length());
		
		
		int a = 10;
		String s3 = String.valueOf(a);
		System.out.println(s3+10);
		
		String s4 = " Java is a programming language. Java is a platform . Java is an Island.";
		
		String replaceString = s4.replace("Java", "Kava");
		System.out.println(replaceString);
	}
}
