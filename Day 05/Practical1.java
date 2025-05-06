class Paper{
	int length;
	int width;
	String text;
	
}

class Document{
	String name;
	Paper p;//declaration (p is a variable and its type is paper) paper object
	
	public static void main(String[] args){
		Document d=new Document();
		System.out.println("Created a Document Object d");
		//document object
		d.name="My First Document";
		System.out.println("Name of the Document d is "+d.name);
		d.p=new Paper();
		//set the length and width of the paper object p of the document d
		d.p.length=12;
		d.p.width=20;
		
		
		d.p.text="This is the text in the paper of the document My First Document";
		System.out.println("Size (l*w) of the Paper of the Document d is "+d.p.length+"*"+d.p.width);
		System.out.println("Size (l*w) of the Paper of the Document d is "+d.p.length*d.p.width);
		
		System.out.println("Text value of paper p of document d is "+d.p.text);
		
		Document d2=new Document();
		d2.name="My Second Document";
		System.out.println("Name of the Document d2 is "+d2.name);
		
		
	}
}
