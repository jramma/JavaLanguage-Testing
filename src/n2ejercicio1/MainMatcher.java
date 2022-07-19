package n2ejercicio1;

import org.hamcrest.Description;
import org.hamcrest.StringDescription;

public class MainMatcher {
	public static void main(String[] args) {

		Description description = (Description) new StringDescription();

		String texto = "Mordor";

		FeatureMatcher test = new FeatureMatcher(8);

		System.out.println(test.matches(texto));
		if (test.matches(texto)) {
			test.describeTo((org.hamcrest.Description) description);

		} else {
			test.describeMismatch(texto, description);
		}

		System.out.println(description);
	}

}
