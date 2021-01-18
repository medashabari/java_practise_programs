/*c. Develop a Java application to generate Electricity bill. Create a class with the following
members: Consumer no., consumer name, previous month reading, current month reading, type
of EB connection
 (i.e domestic or commercial). Commute the bill amount using the following tariff.
If the type of the EB connection is domestic, calculate the amount to be paid as follows:
 First 100 units - Rs. 1 per unit
 101-200 units - Rs. 2.50 per unit
 201 -500 units - Rs. 4 per unit
> 501 units - Rs. 6 per unit
If the type of the EB connection is commercial, calculate the amount to be paid as follows:
 First 100 units - Rs. 2 per unit
 101-200 units - Rs. 4.50 per unit
 201 -500 units - Rs. 6 per unit
 > 501 units - Rs. 7 per unit*/
import java.lang.String;
import java.util.Scanner;

 class Consumer_details{
 	Scanner c = new Scanner(System.in);
 	String consumer_name;
 	int  consumer_no;
 	int previous_month_reading;
 	int current_month_reading;
 	String Ebtype;
 	double bill;

 	public void getConsumerDetails(){
 		System.out.println("Enter consumer no :");
 		consumer_no = c.nextInt();
 		 System.out.println("Enter consumer name :");
 		 consumer_name = c.next();
 		 System.out.println("Enter previous month reading:");
 		 previous_month_reading=c.nextInt();
 		 System.out.println("Enter current month reading:");
 		 current_month_reading=c.nextInt();
         System.out.println("Enter the types of EB Connection(domestic or commercial)");
         Ebtype = c.next();
 	}
 	double calculate_bill(){
 		int choice;
 		if(Ebtype.equals("domestic"))
 			choice=1;
 		else
 			choice=2;
 		switch(choice)
 		{
 			case 1:
 			if(current_month_reading>=0&&current_month_reading<=100)
 						bill=(1*current_month_reading);
 			else if(current_month_reading>100&&current_month_reading<=200)
 						bill=(1*100)+((current_month_reading-100)*2.50);
 			else if(current_month_reading>200&&current_month_reading<=500)
 						bill = (1*100)+(2.50*100)+((current_month_reading-200)*4);
 			else
 			bill= (1*100)+(2.50*100)+(4*300)+((current_month_reading-500)*6);									
 			break;
 			case 2:
 			if(current_month_reading>=0&&current_month_reading<=100)
 						bill=current_month_reading*2;
 			else if(current_month_reading>100&&current_month_reading<=200)
 						bill=(100*2)+((current_month_reading-100)*4.50);
 			else if(current_month_reading>200&&current_month_reading<=500)
 						bill = (100*2)+(100*4.50)+((current_month_reading-200)*6);
 			else
 			bill= (100*2)+(100*4.50)+(300*6)+((current_month_reading-500)*7);									
 			break;

 		}
 		return bill;
 	}
 	void display(){
 		System.out.println("-----------------------------------------");
 		System.out.println("------------Electricity Bill-------------");
 		System.out.println("------------------------------------------");
 		System.out.println("consumer no :"+consumer_no);
 		System.out.println("consumer name :"+consumer_name);
 		System.out.println("previous month reading :"+previous_month_reading);
 		System.out.println("current month reading :"+current_month_reading);
 		System.out.println("consumer electricity bill type :"+Ebtype);
 		System.out.println("-----------------------------------------");
 		System.out.println("Total bill :"+bill);
 	}
 }

 class Electric_Bill{
 	public static void main(String[] args) {
 		Consumer_details obj = new Consumer_details();
 		obj.getConsumerDetails();
 		obj.calculate_bill();
 		obj.display();
 	}
 }




