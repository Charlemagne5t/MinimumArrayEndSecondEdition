import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        int n = 2;
        int x = 4;

        long expected = 5;
        long actual = new Solution().minEnd(n, x);

        Assert.assertEquals(expected, actual);
    }
}
