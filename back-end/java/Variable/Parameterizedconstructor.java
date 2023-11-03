package Variable;

public class Parameterizedconstructor {
	int stud_id;
	String stud_name;//intance variable
	String college;

	public Parameterizedconstructor(){
		//default constructor 
		stud_id=101;
		stud_name="Noble";
		college="JIT";
		System.out.println(stud_id);
		System.out.println(stud_name);
		System.out.println(college);
		
		
		
	}
	public Parameterizedconstructor(int id, String name , String col) {
		//parameterized constructor
		System.out.println(id);
		System.out.println(name);
		System.out.println(col);
	}
	public static void main(String[] args) {
		Parameterizedconstructor sc=new Parameterizedconstructor();
		Parameterizedconstructor sc1=new Parameterizedconstructor (102,"noble","jit");
		
		
}
}
