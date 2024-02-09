package com.arun.arrayrelated;

import java.util.Arrays;

public class CommonElementOfArrays {

	public static void main(String[] args) {
		
		String str1="kushwaha";
		
		
		char arr[]=str1.toCharArray();
		Arrays.sort(arr);
		
		String str= new String(arr);
		
		for(int i=0;i<str.length();)
		{
			char ch= str.charAt(i);
			
			int last= str.lastIndexOf(ch);
			int first=str.indexOf(ch);
			int occ= str.lastIndexOf(ch)- str.indexOf(ch)+1;
			
			System.out.println(ch+ "  : "+occ);
			i= str.lastIndexOf(ch)+1;
			
		}
		


}
}