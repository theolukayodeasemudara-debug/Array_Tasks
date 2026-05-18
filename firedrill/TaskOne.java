public class TaskOne{

    public static int[] getAndDisplayArray(int[] num){
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        int[] arrayList = new int[10];
        
        for(int count = 0; count < arrayList.length; count++){
            System.out.print("enter a number: ");
            int number = inputCollector.nextInt();
            arrayList[count] = number;
        }
        
        for(int index = 0; index < arrayList.length; index++){
            System.out.print(arrayList[index] + " ");
        }
        
        return arrayList;
    }
    
}
