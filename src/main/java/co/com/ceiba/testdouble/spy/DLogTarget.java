package co.com.ceiba.testdouble.spy;

public interface DLogTarget {

	void write(Level level, String message);
    String read(Level level);


}
