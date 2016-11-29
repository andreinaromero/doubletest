
public class TestEngine extends Engine {
	private boolean isRunning;
	@Override
	public void start() {
		this.isRunning = true;
	}
	public boolean isRunning() {
		return this.isRunning;
	}

}





