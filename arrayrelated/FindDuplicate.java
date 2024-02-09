package com.arun.arrayrelated;

import java.util.HashSet;

public class FindDuplicate {

	public static void main(String[] args) {
		int arr[] = { 1,1,2};
		 HashSet<Integer> removeDuplicates = removeDuplicates(arr);
		

		
		
		for(int num:removeDuplicates)
		{
			System.out.println(num);
		}

	}
	
	
	
	 public static HashSet<Integer> removeDuplicates(int[] arr) {
		 HashSet<Integer> s = new HashSet<>();
		 
		 for (int i = 0; i < arr.length; i++) {
				if (s.contains(arr[i])) {
					
					
				} else {
					s.add(arr[i]);
					
				}
			}
		return s;
		 
		 
	 }
	 }


