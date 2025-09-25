
import junit.framework.TestCase;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimeCalTest {
    TimeCal timecal = new TimeCal();

    @Test
    public void testCalTime() {
        assertEquals(1.0, timecal.calTime(100.0, 100.0), 0.01);
    }
}