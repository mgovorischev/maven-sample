package maven.sample;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void sum() throws Exception {
        assertEquals(4, new Main().sum(2, 2));
    }

}