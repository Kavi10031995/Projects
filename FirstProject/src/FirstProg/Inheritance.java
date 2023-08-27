package FirstProg;

class demo2{
	
	void m1() 
	{
		System.out.println("Automation Testing");
	}
	
    void m2() 
    {
    	System.out.println("Selenium Testing");
		
	}

}

class demo3 extends demo2{
	
	// Acquring the methods from one class into another class
	
  void m3() 
  {
	 	  System.out.println("Manual Testing");
		
  }
	
}

public class Inheritance {

	public static void main(String[] args) {
		
		demo3 d3= new demo3();
		d3.m1();
		d3.m2();
		d3.m3();
	
	}

}
