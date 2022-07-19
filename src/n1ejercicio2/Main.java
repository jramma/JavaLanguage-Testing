package n1ejercicio2;

public class Main {

	public static void main(String[] args) {
		CalculoDni calculo = new CalculoDni();

		System.out.println(calculo.calcularDni(Entrada.leerInt("Introduce los numeros de tu DNI")));

		jUnit.testCalcular10Dni();

	}

}
