import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GenerateNumTest {

    @Test
    public void testOne() {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        String result = GenerateNum.generateNum(numbers);

        assertEquals("004", result);
    }

    @Test
    public void testTwo() {
        List<Integer> numbers = Arrays.asList(1, 3);
        String result = GenerateNum.generateNum(numbers);

        Assert.assertEquals("002", result);
    }

    @Test
    public void testThree() {
        List<Integer> numbers = Arrays.asList(3, 2, 3, 1, 10, 11, 8);
        String result = GenerateNum.generateNum(numbers);

        Assert.assertEquals("009", result);
    }

    @Test
    public void testFore() {
        List<Integer> numbers = Collections.EMPTY_LIST;
        String result = GenerateNum.generateNum(numbers);

        Assert.assertEquals("001", result);
    }

    @Test
    public void testFive() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        String result = GenerateNum.generateNum(numbers);

        Assert.assertEquals("011", result);
    }

    @Test
    public void testSix() {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);
        String result = GenerateNum.generateNum(numbers);

        Assert.assertEquals("001", result);
    }
}