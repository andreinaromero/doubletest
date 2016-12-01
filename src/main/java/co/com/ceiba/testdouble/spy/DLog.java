package co.com.ceiba.testdouble.spy;

public class DLog {
	private final DLogTarget[] targets;

	public DLog(DLogTarget... targets) {
		this.targets = targets;
	}

	public void write(Level level, String message) {
		for (DLogTarget each : targets) {
			each.write(level, message);
		}
	}

}
