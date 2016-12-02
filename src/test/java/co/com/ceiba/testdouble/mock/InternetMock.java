package co.com.ceiba.testdouble.mock;

public class InternetMock implements Internet {
	private Boolean translated;
	@Override
	public String searchTranslationFor(String word, Language origin, Language destiny) {
		this.translated = true;
		return "";
	}
	
	public Boolean calledSearchTranslationFor() {
		return this.translated;
	}
	
	public String searchDefinitionInWikipedia(String toSearch) {
		throw new UnsupportedOperationException();
	}


	
	
}
