package com.arun.mix;

public class pali {
	public static void main(String[] args) {
		

		System.out.println(check(121));
		
	}
	
	public static boolean check(int x) {
		int palindrome=0;
		int temp=x;
       while(x>0) {
    	   int rem= x%10;
           x=x/10;
           palindrome=palindrome*10+rem;
       }

        if(palindrome==temp){
            return true;
        }
        else
        {
            return false;
        }

	}

}
