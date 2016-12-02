package co.com.ceiba.testdouble.mock;

public interface Internet {

	String searchTranslationFor(String word, Language origin, Language destiny);
	String searchDefinitionInWikipedia(String toSearch);

	
}
