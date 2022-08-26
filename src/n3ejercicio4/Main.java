package n3ejercicio4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Casa casa = new Casa("Juan", "roja");
		Oficina oficina = new Oficina("IBM", 2);
		Casa casa1 = new Casa("Marta", "Azul");
		Oficina oficina1 = new Oficina("Apple", 4);
		ArrayList<Object> inicial = new ArrayList<Object>();
		ArrayList<Object> edificios = new ArrayList<Object>();

		inicial.add(casa);
		inicial.add(oficina);
		inicial.add(casa1);
		inicial.add(oficina1);
		edificios.add(casa);
		edificios.add(oficina);
		edificios.add(casa1);
		edificios.add(oficina1);
		OrdenArrayList comprobaciones = new OrdenArrayList(inicial);	
		comprobaciones.OrdenInicial(edificios);
		//---------------
		edificios.clear();
		edificios.add(oficina1);
		edificios.add(oficina);
		edificios.add(casa1);
		edificios.add(casa);
		comprobaciones.NoOrdenInicial(edificios);
		//---------------
		edificios.clear();
		edificios.add(casa);
		edificios.add(oficina);
		edificios.add(casa1);
		comprobaciones.UnicoYFalta(edificios);
		//comprobaciones.UnicoYFalta(edificios2);
		
	}

}
