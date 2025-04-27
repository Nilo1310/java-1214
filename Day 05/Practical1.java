class Paper{
	int length;
	int width;
	String text;
	
}

class Document{
	String name;
	Paper p;
	
	public static void main(String[] args){
		Document d=new Document();
		System.out.println("Created a Document Object d");
		d.name="My First Document";
		System.out.println("Name of the document d is "+d.name);
		//d.p=new Paper();
		//d.p.text="This is the text in the paper of document My First document";
		System.out.println("Size of the paper document d is "+d.p.length*d.p.width);
		Document d2=new Document();
		System.out.println("Created a Document Object d2");
		d2.name="My Second Document";
		System.out.println("Name of the document d2 is "+d2.name);
	}
	
}