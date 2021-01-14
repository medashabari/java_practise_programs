/*Develop a java application to implement currency converter (Dollar to INR, EURO to INR,
Yen) using Interfaces.*/
import java.lang.String;
import java.util.Scanner;

interface Currency{
		
	void DollarToInr();
	void EuroToInr();
	void EuroToYen();
}

class Conversions implements Currency{
	 Scanner sc = new Scanner(System.in);
	 double inr=0;
	 double Dollar=0;
	 double euro=0;
	 double yen=0;

	 public void DollarToInr(){
       System.out.println("Enter DOLLARS to convert into INR");
       Dollar=sc.nextDouble();
       inr=Dollar*73.162;
       System.out.println("DOllar "+Dollar+"equal to INR = "+inr);
	 }
	 public void EuroToInr(){
	 	 System.out.println("Enter Euro to convert into INR");
	 	 euro=sc.nextDouble();
	 	 inr=euro*88.65;
	 	 System.out.println("EURO "+euro+"equal to INR = "+inr);

	 }
	 public void EuroToYen(){
	 System.out.println("Enter Euro to convert into INR");
	 euro=sc.nextDouble();
	 yen=euro*126.144;
	 System.out.println("euro "+euro+"equal to YEN = "+yen);
	}
}
class Currency_converter{
    public static void main(String[] args) {
    		 Scanner s = new Scanner(System.in);

    	int choice,ch;
    	Conversions con = new Conversions();
    	do{
		System.out.println("1.Dollar to INR ");
		System.out.println("2.Euro to INR ");
		System.out.println("3.Euro to Yen ");
		System.out.println("Enter ur choice");

	choice=s.nextInt();

	switch(choice){
		case 1: con.DollarToInr();
		break;
		case 2: con.EuroToInr();
		break;
		case 3: con.EuroToYen();
					}
	System.out.println("Enter 0 to  quit and 1 to continue ");
	ch=s.nextInt();
	}while(ch==1);

   	}
}