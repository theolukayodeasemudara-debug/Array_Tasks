import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskOneTest{

    @Test
    public void testThatMethodCollectsTenIntegers(){
        int numbers = 1,2,3,4,5,6,7,8,9,0;
        int[] displayArray = TaskOne.getAndDisplayArray(numbers);
        int[] expected = {1,2,3,4,5,6,7,8,9,0};
        assertArrayEquals(expected, displayArray);
    } 
    
}

// javac -cp "junit-platform-console-standalone-1.11.0.jar" TestFile.java CodeFile.java

// java -cp "junit-platform-console-standalone-1.11.0.jar" org-junit-platform-console.ConsoleLauncher --scan-class-path
