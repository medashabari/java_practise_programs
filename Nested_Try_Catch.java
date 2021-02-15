import java.io.*;
import java.util.Scanner;
public class Nested_Try_Catch {

	public static void main(String[] args) {
	//int a=10,b=0;
		Scanner s = new Scanner(System.in);

		System.out.println("enter A value :" );
		int a = s.nextInt();
		System.out.println("Enter B value");
		int b= s.nextInt();
	try {
	a=a/b;
	System.out.println(a);
	try {
		int arr[]=new int[5];
		arr[8]=10;
	} catch (Exception e) {
	System.out.println("array index bounds are crossed");
	}
	}  catch(Exception e){
		System.out.println("error value");
	}
	
	}

}
