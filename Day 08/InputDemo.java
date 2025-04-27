import java.util.Scanner;

class InputDemo{
	public static void main(String[] args){
		String name;
		int	age;
		byte marks;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Hi Enter your Name:");
		name=sc.nextLine();//read String unti yu press enter key
		System.out.println("Hello "+name+", How are you?");
		
		System.out.println("Hi Enter your Age:");
		age=sc.nextInt();//read the int value
		System.out.println("Ohh god! Are you "+age+", years old?");
		
		System.out.println("Hi Enter your Marks:");
		marks=sc.nextByte();
		System.out.println("You got "+marks+" Marks.");
	}

}