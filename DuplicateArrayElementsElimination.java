// (Duplicate Elimination) Use a one-dimensional array to solve the following problem:
// Write an application that inputs ten numbers, each between 10 and 100, both inclusive. Save
// Use a one-dimensional array to solve the following problem: Write an application that inputs ten numbers, each number that was read in an array that was initialized to a value of -1 for all elements. Assume a value of -1 indicates an array element is empty. You are then to process the array, and remove duplicate elements from the array containing the numbers you input. Display the contents of the array to demonstrate that the duplicate input values were actually removed. [Note: do not display the array elements where the value is -1.]


// steps
// initialize an empty array list with length of 10
// collect 10 numbers from the terminal between 10 and 100
// check for any number less than -1 as an invalid input, as well as numbers less than 10
// save the numbers collected into an arraylist
// loop through the array to remove duplicate entries
// display the new array to show that the duplicates have been successfully removed


public class DuplicateArrayElementsElimination{
    
    
    
    public static void main(String[] args){
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        
        int[] numbers = new int[10];
        
        // looping through the array that currently has values of '0' to the indexes
        // for(int count = 0; count <= 10; count++){
        //     System.out.print("Enter [10] numbers between 10 and 100: ");
        //     int number = inputCollector.nextInt();
            
        //     int index = 1;
        //     for(; index <= numbers.length; index++){
        //      number = numbers[index];
        //     }
            
        //     System.out.print(numbers[index]);
        // }
        int index = 0;
        for(; index < numbers.length; index++){
            System.out.print("Enter numbers between 10 and 100: ");
            int number = inputCollector.nextInt();
            for(int count = 1; count < numbers.length; count++){
                number = numbers[index];
            }
        }
            System.out.print(numbers[index]);
    }
}
