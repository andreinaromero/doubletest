package co.com.ceiba.testdouble.mock;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class TranslatorTest {

	private Translator translator;
	@Mock
	private Internet internetMock;

	@Before
	public void initMocks() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testTranslator() {
		// Arrange
		InternetMock internet = new InternetMock();
		translator = new Translator(internet);
		// Act
		translator.translate("flower", Language.ENGLISH, Language.FRENCH);
		// Assert
		assertTrue("The internet didn't call translate method", internet.calledSearchTranslationFor());
	}

	
	@Test
	public void testTranslatorWithMockito() {
		// Arrange
		translator = new Translator(internetMock);
		// Act
		translator.translate("flower", Language.ENGLISH, Language.FRENCH);
		// Assert
		verify(internetMock).searchTranslationFor("flower", Language.ENGLISH, Language.FRENCH);
	}

}