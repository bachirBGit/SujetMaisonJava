package com.adneom;

import java.util.Arrays;
import java.util.List;

import com.adneom.util.ListUtility;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> liste = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
		System.out.println(liste);
		System.out.println(ListUtility.partition(liste, 4));
	}

}