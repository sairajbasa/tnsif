package practice;

public class VariablesDemo {
	
	static int a=999;    // static variable
	String s="sairaj";   // instance variable

	public static void main(String[] args)
	{
		boolean choice= true;   // local variable
		System.out.println("Static variable ....: "+VariablesDemo.a);  // directly we can call or by using class name we can call
		VariablesDemo obj = new VariablesDemo();
		System.out.println("Instance variable...: "+obj.s);  // by using object reference we can access
		System.out.println("Local variable...: "+choice);   // directly we can access
		

	}

}
