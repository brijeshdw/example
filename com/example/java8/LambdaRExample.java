package com.example.java8;

import java.util.stream.LongStream;

interface Arithmetic {
	public abstract long factorialStreams(long n);
}

public class LambdaRExample implements Arithmetic  {
	@Override
	 public  long factorialStreams(long n) {
	        return LongStream.rangeClosed(2, n)
	                .reduce(1, (long a, long b) -> a + b);
	    }
	public static void main(String[] args) {
	 {
		 LambdaRExample r = new LambdaRExample();
		long x = r.factorialStreams(100);
		System.out.println(x);
		 
	 }
		 
		}
	}

