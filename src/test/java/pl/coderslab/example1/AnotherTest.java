package pl.coderslab.example1;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

public class AnotherTest {
    @Test
    public void firstAnother() {
        assertFalse(2 > 4);
    }

    @Test
    @Ignore
    public void seconsAnother() {
        fail("Not implemented");
    }


}
