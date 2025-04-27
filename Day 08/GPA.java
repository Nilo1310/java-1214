import java.util.Scanner;

class GPA{

	float gradePoint(String grade){
		float gp=0;//grade point value
		/*if(grade.equals("A+" )|| grade.equals("A"))//Find a way to check two strings .compare()
		{
			gp=4;
		}else{
			if(grade.equals("A-")){
				
			}
		}
		return gp;*/
		
		switch(grade){
			case "A+":
			gp=4;
			break;
			case "A":
			gp=4;
			break;
			case "A-":
			gp=3.7f;
			break;
			case "B+":
			gp=3.3f;
			break;
			case "B":
			gp=3;
			break;
			case "B-":
			gp=2.7f;
			break;
			case "C+":
			gp=2.3f;
			break;
			case "C":
			gp=2;
			break;
			case "C-":
			gp=1.7f;
			break;
			case "D+":
			gp=1.3f;
			break;
			case "D":
			gp=1.1f;
			break;
			case "E":
			gp=0;
			break;
			
			default:
			gp=0;
			break;
		}
		return gp;
	}
	
}

class Demo{
	static Scanner sc=new Scanner(System.in);
	static GPA g=new GPA();
	static String name;
	static String subjects[]={"IT1113","IT1122","IT1134","IT1144","IT1152"};
	static int credits[]={3,2,4,4,2};
	
	static String[] grades=new String[5];
	static float[] gps=new float[5];
	
	
	static float getPoint(String subjectCode,int credit, int index){
		System.out.print("Enter the grade for"+subjectCode+": ");
		grades[index]=sc.nextLine();
		gps[index]=g.gradePoint(grades[index])*credit;
		System.out.println("Grade point value of the grade "+grades[index]+" is "+g.gradePoint(grades[index]));
		System.out.println(" Grade Point * credit is "+g.gradePoint(grades[index])*credit);
		return g.gradePoint(grade[index])*credit;
		
		}
		
		
	public static void main(String[] args){
		
		float ogpa=0;
		System.out.println("Enter Your Name:");
		name=sc.nextLine();
		System.out.println("Hi "+name);
		
		for(int i=0;i<5;i++){
			ogpa+=getPoint(subjects[i],credits[i],i);
		}
		
		/*ogpa+=getPoint("IT1113",3);//read the Grade of IT1113, Get the point value, return the point credit
		ogpa+=getPoint("IT1122",2);
		ogpa+=getPoint("IT1134",4);
		ogpa+=getPoint("IT1144",4);
		ogpa+=getPoint("IT1152",2);*/
		
		System.out.println("Final GPA is for current semester is "+ogpa/15);
		for(int i=0;i<5;i++){
			System.out.println("Subject "+subjects[i]+" Credit "+credits[i]+" Grade "+grades[i]+" GradePoint "+gps[i]);
	}
	

} 



/*
Name:Nilo
-----------------------------------------
Subject Code  |  Grade  |  Grade Point
-----------------------------------------
IT1113        |   