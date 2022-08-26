package n3ejercicio4;

public class Oficina {
	private String name;
	private int pisos;
	
	public Oficina(String name, int pisos) {
		this.name = name;
		this.pisos = pisos;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPisos() {
		return pisos;
	}
	public void setPisos(int pisos) {
		this.pisos = pisos;
	}
}
