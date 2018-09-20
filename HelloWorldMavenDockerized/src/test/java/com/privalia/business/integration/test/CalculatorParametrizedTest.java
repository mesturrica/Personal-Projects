package com.privalia.business.integration.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.privalia.business.Calculator;
import com.privalia.business.ICalculator;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;


@RunWith(JUnitParamsRunner.class)
public class CalculatorParametrizedTest {
	@Test
	@Parameters({"0,0,0","1,1,2"})
	public void shouldReturnCorrectSum(int first, int second, int expectedSum){
		ICalculator calculator = new Calculator();
		int actualSum = calculator.sum(first, second);
		assertTrue(actualSum == expectedSum);
	}
	
	
	@Test
	@Parameters({"4,2,2","4,1,3"})
	public void shouldReturnCorrectSubstract(int first, int second, int expectedSubstract){
		ICalculator calculator = new Calculator();
		int actualSubstract = calculator.substract(first, second);
		assertTrue(actualSubstract == expectedSubstract);
	}
	
	
	@Test
	@Parameters({"4,6,24","3,5,15"})
	public void shouldReturnCorrectMultiplyt(int first, int second, int expectedMultiply){
		ICalculator calculator = new Calculator();
		int actualMultiply = calculator.multiply(first, second);
		assertTrue(actualMultiply == expectedMultiply);
	}
	
	
	@Test
	@Parameters({"6,2,3","8,4,2"})
	public void shouldReturnCorrectDivide(int first, int second, int expectedDivide){
		ICalculator calculator = new Calculator();
		int actualDivide = calculator.divide(first, second);
		assertTrue(actualDivide == expectedDivide);
	}
	
	
	
}
