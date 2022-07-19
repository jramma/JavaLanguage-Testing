package n2ejercicio1;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

public class FeatureMatcher extends BaseMatcher<CharSequence> {
	private final int longitudEsperada;

	public FeatureMatcher(int longitudEsperada) {
		this.longitudEsperada = longitudEsperada;
	}

	@Override
	public boolean matches(Object texto) {
		boolean respuesta;
		if (!(texto instanceof CharSequence))
			respuesta = false;

		respuesta = ((CharSequence) texto).length() == longitudEsperada;
		return respuesta;
	}

	@Override
	public void describeTo(Description description) {
		description.appendText("La longitud del texto es " + longitudEsperada);

	}

	@Override
	public void describeMismatch(Object texto, Description description) {
		description.appendText(texto + " no coincide con la longitud esperada.");

	}

}
