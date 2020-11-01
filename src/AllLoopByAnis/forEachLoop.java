package AllLoopByAnis;

public class forEachLoop {

	public static void main(String[] args) {
		String [] names = new String[4];
		
		names[0] = "Mahmud";
		names[1] = "Hossain";
		names[2] = "Nahara";
		names[3] = "Jannat";
		
		System.out.println("----------------------");
		
		for(int i = 0; i<4; i++) {
			
			System.out.println(names[i]);
		}
		
		String[] names2 = {"Mahmud","Hossain","Nahar","Jannat"};
		
		System.out.println(names2.length);
		
		for (int i = 0; i<4; i++) {
			
			System.out.println(names2[i]);
			System.out.println("----------------------");
		
		}
		String[ ] names3 = {"Mahmud","Hossain","Nahar","Jannat"};
		
		for(String x:names3) {
			System.out.println(x);
			System.out.println("----------------------");
		}
		
		int[] num = {10,20,30,40,50,60,70,80,90,100};
		int sum = 0;
		
		for(int y : num) {
			sum = sum +y;
			
			System.out.print(y + ",\t ");
			
		}
		System.out.println("----------------------");
		System.out.println();
		System.out.println("This is total of all numbers : "+ sum);
		
		
		System.out.println("----------------------");}
		}
