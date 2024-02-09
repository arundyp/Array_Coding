package com.arun.mix;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {
	
public static void main(String[] args) {
	List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    Object[] num = list.toArray();
    for (int i = num.length-1; i >= 0; i--) {  
        System.out.print(num[i] + " ");  
    }  

    
}

}
