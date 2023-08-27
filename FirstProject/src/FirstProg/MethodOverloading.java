package FirstProg;

class demo4{
	
	// The Process of specifying multiple methods with same name having different parameters or signatures is called Method Overloading

	// Method name will be same, only parameters or parameters will change(No of parameters, type of parameters, sequence of parameters) 

    void m1() {
    	
    	System.out.println("----");
    	
    }
    
    void m1(int a) {
    	
    	System.out.println(a);
    	
    }
    
    void m1(int a,int b) {
    	
    	System.out.println(a+b);
    	
    }
    
    void m1(String x) {
    	
    	System.out.println(x);
    	
    }

}

public class MethodOverloading {

	public static void main(String[] args) {
		
		demo4 d4 = new demo4();
		d4.m1();
		d4.m1(10);
		d4.m1(10,20);
		d4.m1("Kavi");
              
		

	}

}
