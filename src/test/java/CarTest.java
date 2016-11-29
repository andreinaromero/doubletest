import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {

	@Test
	public void engineIsStartedWhenCarStarts() {
        TestEngine engine = new TestEngine();
        new Car(engine).start();
        assertTrue(engine.isRunning());
    }

}


