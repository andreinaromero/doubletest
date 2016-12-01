package co.com.ceiba.testdouble.spy;

import static org.junit.Assert.*;

import org.junit.Test;

public class DLogTest {

	@Test
	public void itWritesEachMessageToAllTargets() throws Exception {
		SpyDFileLogTarget spy1 = new SpyDFileLogTarget();
		SpyDFileLogTarget spy2 = new SpyDFileLogTarget();
		DLog log = new DLog(spy1, spy2);
		log.write(Level.INFO, "message");
		assertTrue(spy1.calledWrite(Level.INFO, "message"));
		assertTrue(spy2.calledWrite(Level.INFO, "message"));
	}

	
	
}
