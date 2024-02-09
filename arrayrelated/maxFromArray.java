package com.arun.arrayrelated;

public class maxFromArray {
	
	public static void main(String[] args) {
		
		int arr[]= {10,23,54,34,4};
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		for(int i=1;i<arr.length;i++ )
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		
		
		int d=max-min;
		System.out.println(d);
	}

}
