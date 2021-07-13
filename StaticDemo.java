public class StaticDemo{
  public static void main(String args [])
  {
	Student s1 = new Student();
	Student s2 = new Student();
	//System.out.println(s1.id);
	//System.out.println(s1.name);
	System.out.println(Student.noOfStudents);
	System.out.println(s1.noOfStudents);
	System.out.println(s2.noOfStudents);

	Student.m1();
	
  }
}


class Student{
    int id;
    String name; // member variables

    static int noOfStudents = 0;

	static void m1(){
	   System.out.println("I am a static method.");
	}

    Student(){
	noOfStudents++;	
   }
}