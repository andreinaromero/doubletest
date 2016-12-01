package co.com.ceiba.testdouble.spy;

import java.util.ArrayList;
import java.util.List;

public class SpyDFileLogTarget extends DFileLogTarget {
	private List<String> log = new ArrayList<String>();
	@Override
	public void write(Level level, String message) {
		log.add(concatenated(level, message));

	}
	
	private String concatenated(Level level, String message) {
		return level.getName() + ": " + message;
	}

	public boolean calledWrite(Level level, String message) {
		return log.contains(concatenated(level, message));
	}

	

	
	
}
