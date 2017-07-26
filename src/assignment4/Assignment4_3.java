package assignment4; //Package Declaration is compulsory.
/*
 * Program to describe the usage of final keyword.
 */
public class Assignment4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s=new Student(); // Initializing the Student class.
s.showStudent();   // Calling the showStudent method.
ParttimeStudent ps =new ParttimeStudent(); // Initializing parttime student class.
ps.showPartStudent(); // calling the method showpartstudent.
FulltimeStudent fs = new FulltimeStudent(); //  Initializing fulltime student class
fs.showfullStudent(); // calling the method showfullstudent.
	}

}
 class Student{
final	int maxmarks=150; // Declaring and initializing max marks using final keyword.
int rollno; // Declaring the required variables as per the assignment.
	String name;
	int Phymarks;
	int Chemmarks;
	int Javamarks;
 Student() { // Initializing the values of the variables. 
		rollno =78;
		name="Sai";
		Phymarks = 47;
		Chemmarks = 45;
		Javamarks = 48;
	
	}
	final void showStudent() { // Initializin the final keyword as a method.
		int total=Phymarks + Chemmarks + Javamarks;
		System.out.println("Total is "+total+"Out of "+maxmarks);
					
		}
	}

class FulltimeStudent extends Student{ // Creating a class Fulltime student as per the assigment requiurements.
	int rollno;
	String name;
	int Phymarks;
	int Chemmarks;
	int Javamarks;
	FulltimeStudent(){
		rollno =40;
		name="Prabhu";
		Phymarks = 43;
		Chemmarks = 50;
		Javamarks = 47;
	}
	void showfullStudent() { // Initializing the method to calculate total of marks obtained for fulltime student.
		int total=Phymarks + Chemmarks + Javamarks;
		System.out.println("Total is "+total+"Out of "+maxmarks);
					
	}
	}
class ParttimeStudent extends Student{ // Creating the Parttime student class and calculatng the total of marks as per the assignment.
	int rollno;
	String name;
	int Phymarks;
	int Chemmarks;
	int Javamarks;
	ParttimeStudent(){
		rollno =38;
		name="Vijay";
		Phymarks = 50;
		Chemmarks = 49;
		Javamarks = 43;
	}
	void showPartStudent() { // Initializing the method to calculate total of marks obtained for part time student.
		int total=Phymarks + Chemmarks + Javamarks;
		System.out.println("Total is "+total+"Out of "+maxmarks);
					
		}
	}
