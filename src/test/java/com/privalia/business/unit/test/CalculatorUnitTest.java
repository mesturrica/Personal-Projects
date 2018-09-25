package com.privalia.business.unit.test;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

import com.privalia.business.ICalculator;

public class CalculatorUnitTest {

	@Mock
	ICalculator iCalculator;
	
	
	@Before
	public void setUp() throws Exception{
		MockitoAnnotations.initMocks(this);
	}
	
	
	@Test
	public void testAdd(){
		when(iCalculator.sum(2, 3)).thenReturn(5);
		assertTrue(iCalculator.sum(2, 3)==5);
	}
	

	@Test
	public void testSubstract(){
		when(iCalculator.substract(2, 1)).thenReturn(1);
		assertTrue(iCalculator.substract(2, 1)==1);
	}
	
	@Test
	public void testMultiply(){
		when(iCalculator.multiply(2, 1)).thenReturn(2);
		assertTrue(iCalculator.multiply(2, 1)==2);
	}
	
	@Test
	public void testDivide(){
		when(iCalculator.divide(2, 1)).thenReturn(2);
		assertTrue(iCalculator.divide(2, 1)==2);
	}
	
	
	
}
