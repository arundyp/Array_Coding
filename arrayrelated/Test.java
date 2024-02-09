package com.arun.arrayrelated;

public class Test {
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		
		int[] doComputation = doComputation(arr);
		
		for(int i=0;i<doComputation.length;i++)
		{
			System.out.print(doComputation[i]+" ");
		}
		
	}
	
	public static int[] doComputation(int arr[])
	{
		
		for(int i=1;i<arr.length;i++)
		{
			arr[i]=arr[i]+arr[i-1];
			System.out.println("---");
		}
		
		return arr;
		
		
	}

}
