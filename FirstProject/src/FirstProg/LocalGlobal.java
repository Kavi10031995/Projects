package FirstProg;

class demo16{
	
	int a = 10, b=20; // global variable
	
	void m1(){
		
		int c=30;// local variable
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a+b+c);
		
	}
	void m2() {
		int d=40; // local variable
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		System.out.println(a+b+d);
	}
	}
	



public class LocalGlobal {

	public static void main(String[] args) {
		
		demo16 d = new demo16();
		d.m1();
		d.m2();

	}

}
