package sample;

public class Calculator {
	int a=10,b=5;
	public void add()
	{
		this.difference();
		int c=a+b;
		System.out.println("Sum="+c);
	}
	public void difference()
	{
		this.product();
		int c=a-b;
		System.out.println("Difference="+c);
	}
	public void product()
	{
		int m=a*b;
		System.out.println("Product="+m);
	}
	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.add();
		// TODO Auto-generated method stub
		
	}

}
