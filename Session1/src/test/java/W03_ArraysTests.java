import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class W03_ArraysTests {
    @Test
    public void testContainsDuplicate() {
        int[] array = {1, 3, 6, 4, 5};
        assertFalse(W03_Arrays.containsDuplicate(array));

        int[] anotherArray = {1, 2, 3, 4, 1};
        assert(W03_Arrays.containsDuplicate(anotherArray));
    }

    @Test
    public void testNumberOfGoodPairs() {
        int[] array = {1, 3, 6, 4, 5};
        assertEquals(W03_Arrays.numberOfGoodPairs(array), 8);

        int[] anotherArray = {1, 2, 3, 4, 1};
        assertEquals(W03_Arrays.numberOfGoodPairs(anotherArray), 6);
    }
}
