package n1ejercicio1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> meses1 = new ArrayList<String>();
		MesesDelA meses = new MesesDelA(meses1);
		addMeses(meses1);
		System.out.println(meses.toString());

		meses.comprobarMeses();
		meses.testNoEsNull();
		meses.testAgost();
	}
		
		public static void addMeses(ArrayList<String> meses) {
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

}
