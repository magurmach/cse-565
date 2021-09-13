package week5.Sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCheck {
    @Test
    public void testIsOdd() {
        Assertions.assertEquals(false, Check.isOdd(2));
        Assertions.assertEquals(true, Check.isOdd(3));
    }
}
