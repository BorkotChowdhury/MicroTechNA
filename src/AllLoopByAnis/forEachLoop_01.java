package AllLoopByAnis;

public class forEachLoop_01 {

	public static void main(String[] args) {
		
		int[] marks = {125,132,64,29,48,160};
		
		int highest_marks = maximum(marks);
		
		System.out.println("-------------------------------");
		System.out.println("The highest marks is : "+highest_marks);
		System.out.println("-------------------------------");
		}
	public static int maximum(int[] numbers) {
		
		int maxSofar = numbers[0];
		
		for (int num:numbers) {
			
			if(num> maxSofar) {
				maxSofar = num;
			}
		}
		return maxSofar;
		}
	
		}
