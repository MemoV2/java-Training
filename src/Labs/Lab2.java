package Labs;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student("mmo","45678912");
		Student stu2 = new Student("Jse","78945685");
		Student stu3 = new Student("Jan","15948178");
		
		stu1.enroll("Math");
		stu1.enroll("chemistry");
		stu1.enroll("history");
		
		//stu1.showCourses();
		//stu1.checkBalance();
		stu1.paytuition(600);
		//stu1.checkBalance();
		System.out.println(stu1.toString());
	}

}
class Student{
	private static int ID = 1000;
	private String userid;
	private String name;
	private String ssn;
	private String Email;
	private String courses = "";
	private String phone;
	private String city;
	private String state;
	private static final int costofcourse = 800;
	private int balance = 0;
	
	public Student(String name, String ssn){
		ID++;
		this.name = name;
		this.ssn = ssn;
		setUserID();
		setEmail();
	}
	private void setEmail(){
		Email = name.toLowerCase() + "." + ID + "@sdetuniversity.com";
		System.out.println("Email is: " + Email);
	}
	private void setUserID(){
		int max = 9000;
		int min = 1000;
		int randNum = (int)(Math.random() *(max-min));
		randNum = randNum + min;
		userid = ID + "" + randNum + "" + ssn.substring(5);
		System.out.println("User ID is: " + userid);
	}
	public void enroll(String course){
		this.courses = this.courses + "\n" + course;		
		balance = balance + costofcourse;
	}
	public void paytuition(int amount){
		balance = balance - amount;
		System.out.println("payment of: $" + amount + " added");
	}
	public void checkBalance(){
		System.out.println("balance: $" + balance);
		
	}
	public void showCourses(){
		System.out.println(courses);
	}
	public String toString(){
		return "[Name: " + name + " ]\n[Courses: " + courses +  " ]\nBalance: " + balance + " ]";
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}