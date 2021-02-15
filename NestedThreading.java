
public class NestedThreading {

	//public static Thread Thread1;

	public static void main(String[] args)  {
		A  c = new A();
	
		Thread t10 = new Thread();
		Three t = new Three(t10);
		t.start();
		try {
			t.join();
		} catch (Exception e) {
		}
		System.out.println(" Counter my count is :"+ c.count);
		
		class Three extends Thread{

			A c = new A();
					 public void run() {
						 for(int i=1;i<=1000;i++) {
							 c.counterPlus();
							 }
					 }
			
			class Three2 extends Thread{
				public void run() {
					c.counterPlus();
						 }
			}
		}
}
	
}


class  A{
	 int count;
	 synchronized void  counterPlus(){
		 count=count+1;
	 }
	 void co() {
		 System.out.println("I am co");
	 }
}