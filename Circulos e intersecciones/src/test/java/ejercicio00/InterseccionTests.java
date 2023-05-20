package ejercicio00;

import static org.junit.Assert.*;

import org.junit.Test;

public class InterseccionTests {

	@Test
	public void test() {
		
		Circulo c1 = new Circulo(new Punto(0, 0), 1);
		Circulo c2 = new Circulo(new Punto(1, 1), 1.5);
		
		boolean interseccion = c1.intersectaCon(c2); 
		boolean resultadoEsperado = true;
		
		assertEquals(resultadoEsperado, interseccion);
	}
	
	
	@Test
	public void test1() {
		
		Circulo c1 = new Circulo(new Punto(-1, -1), 1);
		Circulo c2 = new Circulo(new Punto(1, 1), 1);
		
		boolean interseccion = c1.intersectaCon(c2); 
		boolean resultadoEsperado = false;
		
		assertEquals(resultadoEsperado, interseccion);
	}

	
	@Test
	public void test2() {
		
		Circulo c1 = new Circulo(new Punto(1, 1), 1);
		Circulo c2 = new Circulo(new Punto(-2, -2), 1);
		
		boolean interseccion = c1.intersectaCon(c2); 
		boolean resultadoEsperado = false;
		
		assertEquals(resultadoEsperado, interseccion);
	}

	
	@Test
	public void test3() {
		
		Circulo c1 = new Circulo(new Punto(-1, -1), 1);
		Circulo c2 = new Circulo(new Punto(-2, -2), 1);
		
		boolean interseccion = c1.intersectaCon(c2); 
		boolean resultadoEsperado = true;
		
		assertEquals(resultadoEsperado, interseccion);
	}
}
