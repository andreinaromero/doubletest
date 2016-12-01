package co.com.ceiba.testdouble.spy;

public class DFileLogTarget implements DLogTarget {

	@Override
	public void write(Level level, String message) {
		//Código para escribir en un archivo en disco

	}

	@Override
	public String read(Level level) {
		//Código para leer desde un archivo en disco
		return "";
	}

}
