package Datatype;
import java.util.Scanner;
public class Studant {

	public static void main(String[] args) {
    int rollno,age;
    long contact;
    String name , Dept;
    char gender;
    Scanner s= new Scanner(System.in);
    System.out.print("enter the rollno:");
    rollno =s.nextInt();
    System.out.print("Enter the name :");
    name=s.next();
    System.out.print("enter the Dept:");
    Dept=s.next();
    System.out.print("enter the gender:");
    gender=s.next().charAt(0);
    System.out.print("enter the age:");
    age=s.nextInt();
    System.out.print("enter the contact:");
    contact=s.nextLong();
    
    
    
    	
    System.out.println("Studant information: ");
    System.out.println("RollNo: "+rollno);
    System.out.println("Name: "+name);
    System.out.println("Dept: "+Dept);
    System.out.println("Contact: "+contact);
    System.out.println("Gender: "+gender);
    System.out.println("Age: "+age);
    

	}

}
