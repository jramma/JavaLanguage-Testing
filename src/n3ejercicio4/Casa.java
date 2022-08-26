package n3ejercicio4;

public class Casa {
	private String propietario;
	private String color;

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Casa(String propietario, String color) {
		this.propietario = propietario;
		this.color = color;
	}

}
