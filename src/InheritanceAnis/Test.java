package InheritanceAnis;

public class Test {

	
	public static void main(String[] args) {
		
		Teacher_01 t1 = new Teacher_01();
		
		t1.name ="Hossain";
		t1.age = 47;
		t1.qualification = "Msc";
		t1.displayInformation2();
		
		System.out.println("-------------------------------");
		Teacher_01 t2 = new Teacher_01();
		t2.name ="Mahmud Hossain";
		t2.age = 48;
		t2.qualification = "Msc in Statistics";
		t2.displayInformation2();
		
		
		
	}
}
