package FirstProg;

class demo1
{
	
	// Static variables can be used in any methods means both static and non-static methods
	// Non Static variables can be used only in non-static methods and not used in static methods
	
	static int a=10; //static variable
	int b=20; //non-static variable
	
	static void m1() {  //static method
		
		System.out.println(a);
		}
	
    void m2() {  //non-static method
    	System.out.println(a);
    	System.out.println(b);
    	System.out.println(a+b);
    	System.out.println(a*b);
	}
	
}

public class StaticNonStatic {

	public static void main(String[] args) {
               
		demo1 d1 = new demo1();
		d1.m1();
		d1.m2();
	
	}

}
