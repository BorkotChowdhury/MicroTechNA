package ArrayListAnis;

import java.util.ArrayList;

public class ArrayList_02 {

	public static void main(String[] args) {
		ArrayList <Integer> number = new ArrayList<Integer>();
		System.out.println("Size : "+number.size());
		//add elements
		number.add(10);
		number.add(20);
		number.add(60);
		number.add(3, 60);
		
		
		System.out.println("ArrayList contains : " +number);
		System.out.println();
		System.out.println("Size = " + number.size());
		
		boolean check = number.isEmpty();
		System.out.println("arraylist empty : "+check);
		
		boolean contain = number.contains(30);
		System.out.println("30 is in the list : "+ contain);
		
		int pos = number.indexOf(40);
		System.out.println("The index of 40 is : "+pos);
		
		
		number.set(3, 50); //replace
		System.out.println("after setting : "+ number);
		int x = number.get(0);
		System.out.println("Index 0 = " + x);
		
		
		
		
		
		//number.clear();
		//System.out.println("after clear ArrayList contains : "+number);
		}	
}
