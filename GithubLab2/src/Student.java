
public class Student {
	String name;
	Student(String name)
	{
		this.name = name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Students");
		Student S1 = new Student("lia");
		System.out.println(S1.name);
	}
}
