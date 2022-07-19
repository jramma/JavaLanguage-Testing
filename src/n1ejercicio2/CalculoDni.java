package n1ejercicio2;


public class CalculoDni {
	private String dni;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "CalculoDni [dni=" + dni + "]";
	}

	public String calcularDni(Integer numeros) {
		int num = numeros % 23;
		char letra = 0;
		jUnit.testNumDni(num);
		String letras= "TRWAGMYFPDXBNJZSQVHLCKE";
		letra = letras.charAt(num);	
		
		dni = numeros.toString() + letra;
		return dni;
	}

}
