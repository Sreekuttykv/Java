package sample;

public class Sample {
	public Sample()
	{
		this(2);
		System.out.println("Print method");
	}
	public Sample(String name)
	{
		this();
		System.out.println("String="+name);
		
	}
	public Sample(int a)
	{
		System.out.println("Number="+a);
	}
	public static void main(String args[])
	{
		Sample s=new Sample("Anu");
		
	}
}
