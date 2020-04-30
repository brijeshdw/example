package com.example.java8;

import java.util.stream.IntStream;
@FunctionalInterface
interface Arithmetic {
	public  int factorialStreams(int n);
}

public class LambdaRExample implements Arithmetic  {
	@Override
	 public  int factorialStreams(int n) {
	        return IntStream.rangeClosed(2, n)
	                .reduce(1, (int a, int b) -> a + b);
	    }
	public static void main(String[] args) {
	 {
		 LambdaRExample r = new LambdaRExample();
		int x = r.factorialStreams(100);
		System.out.println(x);
		 
	 }
		 
		}
	}

