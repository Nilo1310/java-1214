/*
Type conversion and Type casting

boolean
byte
short
char
long
int
float
double
String

*/

class ConverterDemo{
	public static void main(String [] args){
		boolean bo =true;
		byte by= 110; //-128 to 127
		short sh =45;
		char ch ='a';
		long lo =452;
		int in = 456;
		float fl = 33.333f;
		double db = 78.25;
		String st = "Hi";
		
		lo=by; // type conversion
		
		sh=(short)lo;//casting
		
		fl=in;
		
		in=(int)db;
		in=100; //ASCII Value
        ch=(char)in;
		
		System.out.println("Value of boolean bo is:"+bo);
		System.out.println("Value of byte by is:"+by);
		System.out.println("Value of short sh is:"+sh);
		System.out.println("Value of character ch is:"+ch);
		System.out.println("Value of long lo is:"+lo);
		System.out.println("Value of int is:"+in);
		System.out.println("Value of float fl is:"+fl);
		System.out.println("Value of double db is:"+db);
		System.out.println("Value of string st is:"+st);
	}
	
}