package com.codewardev;

import java.util.stream.LongStream;

// https://www.codewars.com/kata/playing-with-digits/train/java

public class DigPow {

	public static long digPow(int n, int p) {
		String[] nNum = String.valueOf(n).split("");
		
		long sum=LongStream.range(0, nNum.length).map(x->{
			return (long) Math.pow(Double.valueOf(nNum[(int) x]), Double.valueOf(p+x));
		}).sum();
		
		return (sum % n == 0? sum / n: -1);
	}

}
