package com.msjava.client;

import java.util.Arrays;

public class PrimitivesArraySorting {

	public static void main(String[] args) {

		// sort primitives array like int array
		int[] intArr = { 5, 9, 1, 100, 76 };
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));

		// sorting String array
		String[] strArr = { "A", "S", "W", "I", "n" };
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));

	}

}
