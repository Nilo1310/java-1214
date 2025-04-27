class Student{
	int marks;
	String name;
	
	Student(){
		System.out.println("Creating a Student Object");
		name="Defaut Name";
	}
	Student(String n,int m){
		System.out.println("Creating a Student Object with name"+n+" and marks "+m);
		name=n;
		marks=m;
	}
}

class App{
	public static void main(String[] args){
		
		System.out.println("Welcome to Demo Class App");
		
		Student s1=new Student();
		System.out.println("Name of the student s1="+s1.name);
		System.out.println("marks of the student s1="+s1.marks);
		s1.name="Nilo";
		s1.marks=100;
		System.out.println("marks of the student s1="+s1.marks);
		System.out.println("Name of the student s1="+s1.name);
		
		Student s2=new Student("Bob",50);
		//s2.marks=50;
		//s2.name="Bob";
		System.out.println("Name of the student s2 ="+s2.name);
		System.out.println("Marks of the student s2="+s2.marks);
	}
}
