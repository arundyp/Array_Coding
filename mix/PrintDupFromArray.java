package com.arun.mix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PrintDupFromArray {

	public static ArrayList<Integer> duplicates(int arr[]) {

		Set<Integer> set = new HashSet<>();
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (set.contains(arr[i])) {
				list.add(arr[i]);
			} else {
				set.add(arr[i]);
				// continue;
			}
		}
		return list;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 6 };

		ArrayList<Integer> duplicates = duplicates(arr);

		System.out.println(duplicates);
	}
}
