import java.util.Scanner;
class Student{
	private int id;
	private String name;
	private String course;
	
	public void setInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your deatil ");
		id=sc.nextInt();
		name= sc.next();
		course= sc.next();
	}
	
	public void getInfo() {
		System.out.println("Id " +id+ "Name " +name+ "Course " +course );
	}
}


public class practice {
	public static void main(String[] args) {
		Student st = new Student();
		st.setInfo();
		st.getInfo();
		
	}
}
