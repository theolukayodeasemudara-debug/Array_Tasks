import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTaskOne {

    @Test
    public void testThatMethodCollectsTenIntegers() {
        // Arrange
        int[] numbers = {1,2,3,4,5,6,7,8,9,0};
        int[] expectedArray = {1,2,3,4,5,6,7,8,9,0};
        // Act
        int[] actualArray = TaskOne.getAndDisplayArray(numbers);
        // Assert
        assertArrayEquals(expectedArray, actualArray);
    }
}

