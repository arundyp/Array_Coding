package com.arun.arrayrelated;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateUsingStream {
	
	public static void main(String[] args) {
		List<Integer>l= new ArrayList<>();
		
		Collections.addAll(l, 1,1,2,2);
		
		Set<Integer>set= new HashSet();
		
		List<Integer> collect = l.stream().
				filter(i->!set.contains(i)).collect(Collectors.toList());
		
		System.out.println(collect);
	}

}
