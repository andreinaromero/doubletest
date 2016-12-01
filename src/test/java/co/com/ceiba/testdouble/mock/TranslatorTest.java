package co.com.ceiba.testdouble.mock;

import static org.junit.Assert.*;

import org.junit.Test;

public class TranslatorTest {

	@Test
	public void test() {
		InternetMock internet = new InternetMock();
		Translator t = new Translator(internet);
		t.translate("flower", Language.ENGLISH, Language.FRENCH);
		assertTrue("The internet didn't call translate method", internet.calledTranslate());
	}

	
}
