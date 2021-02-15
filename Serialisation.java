import java.io.*;
import java.util.Scanner;

public class Serialisation {
	public static void main(String[] args) {
		serialization();
		deserialization();
}
	
	public static void serialization() {
		String name,branch;
        int id;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter id : ");
        id = s.nextInt();
        System.out.println("Enter name : ");
        name = s.next();
        System.out.println("Enter branch :  ");
        branch = s.next();
	Student s1= new Student(id,name,branch);
	 try {
	 File f = new File("D:\\filesjava\\serializefile.txt");
	 f.createNewFile();
	 FileOutputStream fos = new FileOutputStream(f);
	 ObjectOutputStream oos= new ObjectOutputStream(fos);
	 oos.writeObject(s1);
	 System.out.println("Succesfully writtend  \n");
	 oos.close();
	 } catch (Exception e) {
		 System.out.println(e);
   }
}

	public static void deserialization() {
try {
	ObjectInputStream o = new ObjectInputStream(new FileInputStream("D:\\filesjava\\serializefile.txt"));
	 Student s=(Student)o.readObject();    
	  System.out.print("\n id ="+s.id+"  \n name = "+s.name+" \n branch = "+s.branch); 
	  o.close();
} catch (Exception e) {
	 System.out.println(e);
		}
	}
}
 class Student implements Serializable{
	int id;
	String name,branch;
	Student(int id, String name,String branch) {
		  this.id=id;
		  this.name = name;
		  this.branch = branch;
	    }
	}
