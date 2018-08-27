package studentDataBase;

public class Student {

	public static void main(String[] args) {
		/*
		 Create a Student Database with the following attributes:
		- New Student constructor that takes name and SSN in the arguments
		- Automatically create an email ID based on the name
		- Set a private static ID
		- Generate a user ID that is combination of Static ID, random 4-digit number between 1000 and 9000, and last 4 of SSN
		
		- Methods: enroll(), pay(), checkBalance(), toString(), showCourses()
		- Use encapsulation to set variables (phone, city, state)
		 */
		newStudent student1 = new newStudent("Jim","465329874");
		newStudent student2 = new newStudent("John","298744653");
		newStudent student3 = new newStudent("Memo","465329874");
		newStudent student4 = new newStudent("Sam","874465329");
		
		student1.enroll("xamarin");
		student1.pay(1000);
		student1.showCourses();
		System.out.println(student1.toString());
		student2.enroll("android");
		student2.pay(2000);		
		System.out.println(student2.toString());
		student3.enroll("ios");
		student3.pay(2000);		
		System.out.println(student3.toString());
		student4.enroll("xamarin");
		student4.pay(500);		
		System.out.println(student4.toString());

	}
}
class newStudent {
	private String name;
	private String ssn;
	private static int ID = 2589;
	private String userID;
	private String phone;
	private String city;
	private String state;
	private double balance = 0;
	private String course;
	
	String[] courses = {"android", "IOS", "Xamarin"};
	
	
	public newStudent(String name,String ssn){
		this.name = name;
		this.ssn = ssn;
		setUserID();
		System.out.println(name + ssn + "@school.edu" + "\n" + "The user ID is" + userID);			
		ID++;
		
	}
	public void setUserID(){
		//Generate a user ID that is combination of Static ID, random 4-digit number between 1000 and 9000, and last 4 of SSN
		int rndnum = 1000 + (int)(Math.random()*(9000 - 1000)+1);
		userID = ID+ "" + rndnum + "" + ssn.substring(5,9);	
	}

	public String enroll(String course){
		this.course = course;
		return course;
	}	
	public void pay(double amnt){
		balance = balance + amnt;
		System.out.println("Current balance is: " + balance);
	}
	public void checkBalance(){
		System.out.println(balance);
	}
	//Use encapsulation to set variables (phone, city, state)
	
	public void setphone(String phone){
		this.phone = phone;
	}
	public String getphone(){
		return phone;
	}
	public void setcity(String city){
		this.city = city;
	}
	public String getcity(){
		return city;
	}
	public void setstate(String state){
		this.state = state;
	}
	public String getstate(){
		return state;
	}
	@Override
	public String toString(){
		return "[Name: " + name + "]\n[SSN: " + ssn + "]\n" + "[User ID: " + userID + "]\n" + "[User Email: " + name + ssn + "@school.edu" + "]\n"+ "[Course: " + course + "]\n"  + "[Balance: " +  balance + "]";				
	}
	public void showCourses(){  
		String sCourses = "";
	    for(int i=0;i < courses.length; ++i)
	    {  
	    	sCourses = sCourses + courses[i];  
	    }  
		
		System.out.println(sCourses);
	}

}
