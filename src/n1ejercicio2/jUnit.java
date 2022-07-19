package n1ejercicio2;

import org.junit.Test;

import junit.framework.TestCase;

public class jUnit extends TestCase {

	public static void testNumDni(int num) {
		assertTrue(num > -1 && num < 23);
	}

	@Test
	public static void testCalcular10Dni() {
		CalculoDni calculo = new CalculoDni();
		assertEquals(calculo.calcularDni(23987632), "23987632N");
		assertEquals(calculo.calcularDni(12341234), "12341234D");
		assertEquals(calculo.calcularDni(24876530), "24876530Y");
		assertEquals(calculo.calcularDni(45876653), "45876653W");
		assertEquals(calculo.calcularDni(34876634), "34876634D");
		assertEquals(calculo.calcularDni(23452345), "23452345G");
		assertEquals(calculo.calcularDni(11123456), "11123456N");
		assertEquals(calculo.calcularDni(45693200), "45693200C");
		assertEquals(calculo.calcularDni(87654873), "87654873X");
		assertEquals(calculo.calcularDni(12121212), "12121212M");

	}

}
