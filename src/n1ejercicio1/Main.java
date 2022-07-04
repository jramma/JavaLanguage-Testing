package n1ejercicio1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> meses1 = new ArrayList<String>();
		MesesDelA meses = new MesesDelA(meses1);
		meses.addMeses();
		System.out.println(meses.toString());

		meses.comprobarMeses();
		meses.testNoEsNull();
		meses.testAgost();

	}

}
