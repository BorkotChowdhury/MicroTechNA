package Static_Variable_Method_Block;

	public class StaticBlock {

	
	static int id;
	static String name;
	
	static {
		
		id = 101;
		name = "Mahmud";
			}
	
	static void display () {
		System.out.println("id : "+id);
		System.out.println("Name : " +name);
		}
	
		//public static void main(String[]args) {
		//StaticBlock.display();}
		}

