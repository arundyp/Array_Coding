package com.arun.mix;

public class CountFrequency {

	public static void main(String[] args) {

		int num = 123452322;
		int digit = 2;

		int num1 = countF(num, digit);
		System.out.println(num1);
	}

	public static int countF(int num, int digit) {

		int rem = 0;
		while (num != 0) {

			int c = num % 10;
			num = num / 10;
			if (c == digit) {
				rem++;
			}
		}

		return rem;
	}

}
