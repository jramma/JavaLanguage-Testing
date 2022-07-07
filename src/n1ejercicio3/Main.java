package n1ejercicio3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Object a;
		try {
			ArrayList <Integer> numeros = new ArrayList <Integer>();
			numeros.add(1);
			numeros.add(2);
			numeros.get(2);
			
			}catch( IndexOutOfBoundsException e) {
				a =e;
				System.out.println(e.getMessage());
			}finally{
				
			}
	}

}
