package oop;

class Person{
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " esta caminando");
	}
	void eat(){
		System.out.println(name + " esta comiendo");
	}
	void sleep(){
		System.out.println(name + " esta durmiendo");
	}
}

public class Demo {

	public static void main(String[] args) {
		//Instantiating an object
		Person person1 = new Person();
		
		//define properties
		person1.name = "Memo";
		person1.email = "Memo@fakemail.com";
		person1.phone = "998331442";
		
		//abstraction
		person1.walk();
		person1.eat();
		person1.sleep();
		
		Person person2 = new Person();
		
		person2.name = "Paty";
		person2.email = "paty@coldmail.com";
		person2.phone = "998998998";
		
		person2.eat();
		
		/*// Person
		//attributes, variables, adjectives, descriptions 
		String Name = "Memo";
		String Email = "Memo@fakemail.com";
		String Telefono = "998331442";
		
		//action, activity, behavior
		String Name2 = "Paty";
		String Email2 = "Paty@fakemail.com";
		String Telefono2 = "442331998";
	}
	public void walking(String name){
		System.out.println(name + "esta caminando");
		*/
	}
}
