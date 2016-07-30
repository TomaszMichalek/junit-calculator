package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.junit.Assert;
import main.Calculator;

public class CalculatorTest {
	
	private Calculator classUnderTest;
	
	@BeforeClass
	public static void BeforeClassExample() {
		System.out.println("Wykona sie raz przed wszystkikmi testami");
	}
	
	@AfterClass
	public static void AfterClassExample() {
		System.out.println("Wykona sie raz po wszystkich testach");
	}
	
	@Before
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new Calculator();
	}
		
	@After
	public void tearDown() {
		System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}
	
	@Test
	public void testSum() throws Exception {
		double z1 = 1.9;
		double z2 = 1.5;
		
		double wynik = classUnderTest.sum(z1, z2);
		
		Assert.assertEquals(3.4, wynik, 0.00001);
	}
	
	@Test
	public void testSubtract() throws Exception {
		double z1 = 3;
		double z2 = 2;
		
		double wynik = classUnderTest.subtract(z1, z2);
		
		Assert.assertEquals(1, wynik, 0.00001);
	}
	
	@Test
	public void testMultiply() throws Exception {
		double z1 = 2.5;
		double z2 = 4;
		
		double wynik = classUnderTest.multiply(z1, z2);
		
		Assert.assertEquals(10, wynik, 0.00001);
	}

	@Test (expected = Exception.class)
	public void testDivide0() throws Exception {
		double z1 = 5;
		double z2 = 0;
		
		double wynik = classUnderTest.divide(z1, z2);
	}
	
	@Test
	public void testDivide() throws Exception {
		double z1 = 12;
		double z2 = 3;
		
		double wynik = classUnderTest.divide(z1, z2);
		
		Assert.assertEquals(4, wynik, 0.00001);
	}
	


}
