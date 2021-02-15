public class MultiThread_Meth_Block {
	public static void main(String[] args) throws  Exception{
		 Counter c = new Counter();
	class ThreadOne extends Thread{
		public void run() {
			for(int i =1  ; i<=1000;i++) {
				 c.counterPlus();
		 }	
		}
	}
	class ThreadTwo extends Thread{
		public void run() {
			for(int i =1  ; i<=1000;i++) {
				 c.counterPlus();
		 }	
		}
	}
	class MyThread1 extends Thread{  
		Counter c;  
		MyThread1(Counter c){  
		this.c=c;  
		}  
		public void run(){  
		c.printTable(5);  
		}  
		  }  
	class MyThread2 extends Thread{  
		Counter c;  
		MyThread2(Counter c){  
		this.c=c;  
		}  
		public void run(){  
		c.printTable(10);  
		}  
		  }  
		//Thread t1= new Thread();
		Thread obj = new ThreadOne();
		Thread obj1 = new ThreadTwo();
		Thread obj2 = new MyThread1(c);
		Thread obj3 = new MyThread2(c);
		obj.start();
		obj1.start();
		System.out.println("I am goint to print");
		obj2.start();
		obj3.start();
		try {
			System.out.println("Hey counter wait until obj2 and obj3 executes");
			//obj.join();
			//obj1.join();
			obj2.join();
			obj3.join();
		} catch (Exception e) {};
		 System.out.println(" Counter my count is :"+c.count);
	}}

 class  Counter{
	 int count;
	 synchronized void  counterPlus(){
		 count=count+1;
	 }
		 void printTable(int n) {  
			   synchronized(this){//synchronized block  
			     for(int i=1;i<=5;i++){  
			      System.out.println(n*i);  
			      try{  
			      Thread.sleep(400);
			      }catch(Exception e){System.out.println(e);}  
			     }  
			   }  	 
	 }
 }
 

 
 
 