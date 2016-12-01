package co.com.ceiba.testdouble.mock;

public class Translator {
	
	private Internet internet;
	
	public Translator(Internet theInternet) {
		this.internet = theInternet;
	}

	public String translate(String word, Language origin, Language destiny) {
		String wordTranslated = "";
		if (!word.isEmpty()) {
			wordTranslated = internet.searchTranslationFor(word, origin, destiny);
		}
		return wordTranslated;
	}
	
	
	
}
