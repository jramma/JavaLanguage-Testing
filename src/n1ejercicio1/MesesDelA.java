package n1ejercicio1;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class MesesDelA extends TestCase {
	private ArrayList<String> meses;

	public MesesDelA(ArrayList<String> meses) {

		this.meses = meses;
	}

	public ArrayList<String> getMeses() {
		return meses;
	}
	
	@Test
	public void comprobarMeses() {
		assertTrue(meses.size() == 12);
	}
	
	@Test
	public void testNoEsNull() {
		
		assertTrue(meses != null);
	}
	
	@Test
	public void testAgost() {
		assertTrue(meses.get(7).equalsIgnoreCase("agosto"));
	}

	

	@Override
	public String toString() {
		return "MesesDelA [meses=" + meses + "]";
	}

}
