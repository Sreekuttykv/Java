package sample;

import java.util.Scanner;  
public class ArraySum  
{  
	public static void main(String args[])   
	{    
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter the size of the array: ");  
		int n=sc.nextInt(); 
		int sum=0;
		int a[] = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{     
			a[i]=sc.nextInt();  
		}  
		System.out.println("Array elements are: ");  
		for (int i=0; i<n; i++)   
		{  
			System.out.println(a[i]+" ");  
			sum=sum+a[i];
		} 
		System.out.println("Sum of array elements are:"+sum);
	}  
}  