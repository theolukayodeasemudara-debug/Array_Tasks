public class TaskTwo{
        public static int[] reverseArray(int [] numbers){

        int [] reversedArray = new int [numbers.length];
        
        int indexOfNewArray = 0;        

        for(int index = numbers.length - 1; index >= 0; index--){
            
            reversedArray[indexOfNewArray] = numbers[index];
            indexOfNewArray++;
        }

        return reversedArray;
    }
}
