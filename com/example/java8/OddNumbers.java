package com.example.java8;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

public class OddNumbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

		List<Integer> odd = list.stream().filter(i -> i%2 != 0)
											              .map(i -> i)
											              .collect(toList());

		System.out.println("Odd number ArrayList Integers: "+odd);
	}

}
