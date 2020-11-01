package Instance_02;

	public class Variable {

	String name;
	int id;
	static String universityName = "University of Chittgong";
	
	
	Variable(String n, int i){
		name = n;
		id = i;
	}
	
	void display() {
		System.out.println("--------------------------------------");
		System.out.println("Name : "+name);
		System.out.println("Id  : "+ id);
		System.out.println("University Name : " + universityName);
		System.out.println("--------------------------------------");
		}
		}
