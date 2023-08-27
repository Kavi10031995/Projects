package FirstProg;

class Parent{
	
	void m1() {
		System.out.println("Automation Testing");
	}
}

class child extends Parent{
	
	void m1() {
		System.out.println("Selenium Testing");
	}
	
}

public class MethodOverriding {

	public static void main(String[] args) {
		child c = new child();
		c.m1();

	}

}
