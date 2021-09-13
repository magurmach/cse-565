package week5.part1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestVendingMachine {
    @Test
    public void testDispenseItem() {
        class TestCase {
            public final int input;
            public final String item;
            public final String expected;

            public TestCase(int input, String item, String expected) {
                this.input = input;
                this.item = item;
                this.expected = expected;
            }
        }
        List<TestCase> testcases = new ArrayList<>();
        testcases.add(new TestCase(0, "candy", "Item not dispensed, missing 20 cents. Cannot purchase item."));
        testcases.add(new TestCase(20, "coke", "Item not dispensed, missing 5 cents. Can purchase candy."));
        testcases.add(new TestCase(25, "coffee", "Item not dispensed, missing 20 cents. Can purchase candy or coke."));
        testcases.add(new TestCase(20, "candy", "Item dispensed."));
        testcases.add(new TestCase(45, "candy", "Item dispensed and change of 25 returned"));
        for (TestCase tc: testcases) {
            Assertions.assertEquals(tc.expected, VendingMachine.dispenseItem(tc.input, tc.item));
        }
    }
}
