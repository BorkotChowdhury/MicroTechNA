package Boolean;

public class BooleanInJava02 {

	
	public static void main(String[] args) {
		//boolean passedDoor = (1==1);
		
		boolean passedDoor = true;
		boolean missedDoor = false;
		boolean passAllDoors = false;
		
		int doorCount = 0;
		
		
		if(passedDoor) {
			System.out.println("\n" + "We are in the if statement");
			doorCount = doorCount +1;
		}
		if(missedDoor) {
			System.out.println("We passed the first door");
			doorCount = doorCount +1;	
		}
		if(passedDoor) {
			System.out.println("We passed the second door");
			doorCount = doorCount +1;	
		}
		
		if(passedDoor) {
			System.out.println("We passed the third door");
			doorCount = doorCount +1;	
		}
		if(doorCount ==3) {
			passAllDoors = true;
		}
		if (passAllDoors) {
			System.out.println("Congratualations.");
		}
		}
		}
