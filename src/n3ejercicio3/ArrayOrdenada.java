package n3ejercicio3;

import static org.junit.Assert.assertArrayEquals;


import org.junit.Test;

public class ArrayOrdenada {
	public static void main(String[] args) {
		//si creas dos array diferentes entonces te saltará el assert
	int numeros[] = {1,2,3,4};
	int numeros1[] = {1,2,3,4};
	SonIdenticos(numeros, numeros1);
	
	
	}
	
	@Test
	static void SonIdenticos(int numeros[], int numeros1[]){
		
		assertArrayEquals("No son iguales",numeros, numeros1);
		System.out.println("Son iguales");
	}

}
