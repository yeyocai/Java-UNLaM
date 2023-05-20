package ejercicio02;

import static org.junit.Assert.*;

import org.junit.Test;

public class JinetesTests {

	@Test
	public void test() {
		
		Ejercicio02 ej02 = new Ejercicio02();
		assertEquals(1, ej02.jinetes(new int[] {18, 15})); 
	}
	
	
	@Test
	public void test1() {
		
		Ejercicio02 ej02 = new Ejercicio02();
		assertEquals(2, ej02.jinetes(new int[] {43, 23, 40, 13}));
	}

	
	@Test
	public void test2() {
		
		Ejercicio02 ej02 = new Ejercicio02();
		assertEquals(3, ej02.jinetes(new int[] {33, 8, 16, 47, 30, 30, 46}));
	}
	
	
	@Test
	public void test3() {
		
		Ejercicio02 ej02 = new Ejercicio02();
		assertEquals(3, ej02.jinetes(new int[] {51, 51, 51}));
	}

	
	@Test
	public void test4() {
		
		Ejercicio02 ej02 = new Ejercicio02();
		assertEquals(4, ej02.jinetes(new int[] {6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 40, 49}));
	}
}
