package n3ejercicio1;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ObjetoEntero {

	private int numero;

	public ObjetoEntero(int numero) {

		this.setNumero(numero);

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public static void main(String[] args) {

		ObjetoEntero entero1 = new ObjetoEntero(1);
		ObjetoEntero entero2 = new ObjetoEntero(1);

		test(entero1, entero2);

	}

	@Test
	static void test(ObjetoEntero numero1, ObjetoEntero numero2) {

		assertEquals("No son iguales",numero1.getNumero(), numero2.getNumero());
		System.out.println("son iguales");
	
	}

}
