package FirstProg;

public class MyConstructor {
	
	 MyConstructor() 
	 {
		 
		 System.out.println("---");
		 
	 }
	 MyConstructor(int a)
	 {
		 System.out.println(a);
	 }
	 
     MyConstructor(int a,int b)
     {
    	 System.out.println(a+b); 
	 }
     
     MyConstructor(String a)
     {
    	 System.out.println(a); 
	 }
	 

	public static void main(String[] args) {
		
		MyConstructor mc = new MyConstructor();
		MyConstructor mc1 = new MyConstructor(10);
		MyConstructor mc2 = new MyConstructor(10, 20);
		MyConstructor mc3 = new MyConstructor("Testing");
              
	}

}
