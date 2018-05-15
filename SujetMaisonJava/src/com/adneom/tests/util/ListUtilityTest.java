package com.adneom.tests.util;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.adneom.util.ListUtility;


public class ListUtilityTest {

	@Test
	public void testPartitionClassicCase() {
		
		List<Integer> source = Arrays.asList(23, 1, 3, 6, 7, 9, 12, 1, 2, 5, 8, 11, 7, 4, 10);
		
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(23, 1, 3, 6, 7, 9));
		expected.add(Arrays.asList(12, 1, 2, 5, 8, 11));
		expected.add(Arrays.asList(7, 4, 10));
		
		Assert.assertEquals(expected, ListUtility.partition(source, 6));
		
	}
	
	@Test
	public void testPartitionTooBigLengthCase() {
		
		List<Integer> source = Arrays.asList(23, 1, 3, 6, 7, 9, 12, 1, 2, 5, 8, 11, 7, 4, 10);
		
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(source);
		
		Assert.assertEquals(expected, ListUtility.partition(source, 20));
		
	}
	
	@Test
	public void testPartitionEmptyListCase() {
		
		List<Integer> source = new ArrayList<Integer>();
		
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		
		Assert.assertEquals(expected, ListUtility.partition(source, 20));
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testPartitionExceptionCase() {
		
		List<Integer> source = Arrays.asList(23, 1, 3);
		ListUtility.partition(source, 0);
		
	}

}