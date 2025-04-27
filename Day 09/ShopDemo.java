import java.util.Scanner;
class ShopDemo{

  static String description[]={"Bread","Milk Powder","Tooth paste"};//item description
  static int unitPrice[]={160,1060,260};
  
  static byte[] itemBasketIndex=new byte[3];
  static int  [] itemBasketQuantity=new int[3];
   
  static void getItems(){
	   Scanner sc=new Scanner (System.in);
	   System.out.println("Welcome to the Demo Shop");
	   System.out.println("Please select your items by entering the number");
	   char userOption='y';
	   int basketIndex=0;
	   
	   do{
	   
	   for(int i=0; i<description.length;i++){
		   System.out.println("Enter "+i+" for "+description[i]);
           }
		   
		   int itemIndex=sc.nextInt();
		   
		   System.out.println("You have choosen "+description[itemIndex]);
		   System.out.println("Unit price of "+description[itemIndex]+" is "+unitPrice[itemIndex]);
		   
		   System.out.println("Enter the quantity");
		   int numberOfUnits=sc.nextInt();
		   
		   itemBasketIndex[basketIndex]=(byte)itemIndex;
		   itemBasketQuantity[basketIndex]=numberOfUnits;
		   basketIndex++;
		   
		   System.out.println("Enter y to continue, press any character to exit");
		   
		   Scanner scl=new Scanner(System.in);
		   userOption=new Scanner(System.in).nextLine().charAt(0); // (char)sc.nextLine();
   }
   while(userOption=='y' && basketIndex<3);
   
   
  }
   
   static void showBasket(){
	   System.out.println("No\t Item \t Unit Price \t Quantity \t Price ");
	   for(int i=0; i<itemBasketIndex.length; i++){
		   System.out.println(i+" \t"+description[itemBasketIndex[i]]+ "\t\t" +unitPrice[itemBasketIndex[i]]+" \t\t" +itemBasketQuantity[i]+" \t"+unitPrice[itemBasketIndex[i]]*itemBasketQuantity[i]);
	   
		}
   
   }
   public static void main(String[] args){
	   getItems();
	   showBasket();
   }
   
}