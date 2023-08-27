package FirstProg;

 class demo{
	
	void m1()
	{
		 System.out.println("Automation Testing");
	}
	void m2()
	{
		 System.out.println("Selenium Testing");
	}
	void m5()
	{
		 System.out.println("Testing is Mandatory");
	}
}	
	 class demo15{
		void m3()
		{
			System.out.println("Hello");
		}
		
		void m4()
		{
             System.out.println("Testing");
		}
	}

public class DemoObjRef {
	
	public static void main(String[] args) {
		demo d = new demo();
		d.m1();
		d.m2();
		d.m5();
		demo15 d15=new demo15();
		d15.m3();
		d15.m4();
		
            
	}

}
