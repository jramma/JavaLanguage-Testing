package n3ejercicio2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Objeto {

	private String objeto;

	public Objeto(String objeto) {
		this.objeto = objeto;
	}

	public String getObjeto() {
		return objeto;
	}

	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}

	public static void main(String[] args) {
		
		Objeto objeto = new Objeto ("casa");
		Objeto objeto1= objeto;
		MismaReferencia(objeto, objeto1);
		
	}
	
	@Test 
	static void MismaReferencia(Objeto objeto, Objeto objeto1) {
		
		assertEquals("No tienen misma referencia",objeto, objeto1);
		System.out.println("Misma referencia");
			
	}
	
		
}
