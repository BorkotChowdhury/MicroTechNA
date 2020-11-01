
package JavaSetNGet;


public class AccountSetNGet {

		String name;
		int age;
			
			public static void main(String[]args) {
	
			AccountSetNGet a = new AccountSetNGet();
			//a.age = 34;
			//a.name = "Hossain";
			a.setName("Hossain");
			a.setAge(96);

			System.out.println("My name is "+ a.getName());
			System.out.println("My age is " + a.getAge());
			
			a.printDetails(); 

			//System.out.println(a.age);
			//System.out.println(a.name);
			}

			public void setName (String name) {
			this.name= name;}

			public void setAge(int age) {
			this.age = age;
			}
			
			public String getName() {
			return this.name;

			}
			public Integer getAge() {
			return	this.age;
			}
			public void printDetails() {
			System.out.println(getName() + "," + getAge());
	
			//System.out.println(name + "," +age);
			}
			}



 