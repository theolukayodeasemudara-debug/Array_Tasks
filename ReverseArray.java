// collect 10 integers from a user
// use a loop to collect 10 integers and store them in the array we already initialised
// reverse the array without creating a second array
// display the reversed array

public class ReverseArray{
    public static void main(String[] args){
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        
        int[] arrayList = new int[10];
        
        for(int count = 0; count < arrayList.length; count++){
            System.out.print("enter a number: ");
            int number = inputCollector.nextInt();
            arrayList[count] = number;
        }
        
        for(int index = arrayList.length - 1; index >= 0; index--){
            System.out.print(arrayList[index] + " ");
        }
    }
}
