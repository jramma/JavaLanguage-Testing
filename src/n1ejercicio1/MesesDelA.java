package n1ejercicio1;

import java.util.ArrayList;

import junit.framework.TestCase;

public class MesesDelA extends TestCase {
	private ArrayList<String> meses;

	public MesesDelA(ArrayList<String> meses) {

		this.meses = meses;
	}

	public ArrayList<String> getMeses() {
		return meses;
	}

	public void comprobarMeses() {
		assertTrue(meses.size() == 12);
	}

	public void testNoEsNull() {
		assertTrue(meses != null);
	}

	public void testAgost() {
		assertTrue(meses.get(7).equalsIgnoreCase("agosto"));
	}

	public void addMeses() {
		meses.add("enero");
		meses.add("febrero");
		meses.add("marzo");
		meses.add("abril");
		meses.add("mayo");
		meses.add("junio");
		meses.add("julio");
		meses.add("agosto");
		meses.add("septiembre");
		meses.add("octubre");
		meses.add("noviembre");
		meses.add("diciembre");

	}

	@Override
	public String toString() {
		return "MesesDelA [meses=" + meses + "]";
	}

}
