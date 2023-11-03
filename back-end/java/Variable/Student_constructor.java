package Variable;

public class Student_constructor {

	
		int stud_id;
		String stud_name;
		String college;
	
		public Student_constructor(){
			stud_id=101;
			stud_name="Noble";
			college="JIT";
			System.out.println(stud_id);
			System.out.println(stud_name);
			System.out.println(college);
			
			
			
		}
		public static void main(String[] args) {
			Student_constructor sc=new Student_constructor();
			
	}

}
