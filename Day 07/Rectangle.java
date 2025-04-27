class Rectangle{
	
	int height;
	int width;
	
	Rectangle(int height, int width){
	this.height=height;
    this.width=width;
		System.out.println("Just created a rectangle object with size(h*w)"+height+"*"+width);
		print(width,height);
	}
	
	
	void print(int width, int height){
		for(int i=0; i<height; i++){ //for lines i.e., height
			for(int j=0; j<width; j++){ // for the *'s i.e., width
				System.out.print("* "); // * in each line
			}
			System.out.println(" "); //break ine
		}
	}
	
}


class Main{
	public static void main(String[] args){
		/*for(int i=0; i<10; i++){
			System.out.println("Value of i is"+i);
		}
		*/
		Rectangle r1=new Rectangle(5,6);
		Rectangle r2=new Rectangle(4,7);
		Rectangle r3=r1;
		System.out.println("r1: Height "+r1.height+" , Width "+r1.width);
		System.out.println("r2: Height "+r2.height+" , Width "+r2.width);
		System.out.println("r3: Height "+r3.height+" , Width "+r3.width);
		
	}
	
}
//hit you may use nested for loops and print, println
/*Expected output:
***
***
***
***
*/