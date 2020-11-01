package ArrayListAnis;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayList_01 {

	public static void main(String[] args) {
		ArrayList <Integer> number = new ArrayList<Integer>();
		System.out.println("Size : "+number.size());
		//add elements
		number.add(10);
		number.add(20);
		number.add(60);
		number.add(3, 60);
		
		
		System.out.println("ArrayList contains : " +number);
		
		//System.out.println(number);
		
		/*for(int x : number) {
			System.out.println(" " +x);}*/
		for(int i : number) {
			System.out.println(i + " ");
		}
		number.remove(2);
		System.out.println("after removing ArrayList contains : "+ number);
		
		number.removeAll(number);
		System.out.println("after removing all : "+number);
	
		System.out.println("Size : "+number.size());
	}	
	}
	
	//Anis 63

