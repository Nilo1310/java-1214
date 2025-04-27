class Student{
	String name="Nilo";
	int marks=100;
	Student(){
		name="NoName";
	}
	Student(String n){
		name=n;
	}
	
	Student(String n, int m){
		name=n;
		marks=m;
	}
	
	}
	
	

class StudentDemo{
	public static void main(String[] args){
		System.out.println("Hi From StudentDemo Class");
		System.out.println("Creating an object of Student Class");
		Student s1=new Student("Nice Name");
		System.out.println("Created an object of Student Class");
		System.out.println("Name value of the object is"+s1.name);
		System.out.println("Marks value of the object is"+s1.marks);
		
		s1.name="Bob";//setting the variable value
		s1.marks=10;
		
		System.out.println("Name value of the object is"+s1.name);//getting the variable value
		System.out.println("Marks value of the object is"+s1.marks);
		
	}
}

