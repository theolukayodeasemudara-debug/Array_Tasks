import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestTaskTwo{

        @Test
        public void testThatReverseArrayGivesArrayFromTheLastElement(){
        // Arrange
        int[] arrayList = {50, 20, 12, 8, 36, 200, 67};
        int[] expectedReversedArray = {67,200, 36, 8, 12, 20, 50};
        
        // Act
        int[] ActualArray = TaskTwo.reverseArray(arrayList);
        
        // Assert
        assertArrayEquals(expectedReversedArray, ActualArray);
    }

}
