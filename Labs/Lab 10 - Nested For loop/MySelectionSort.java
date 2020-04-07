//David Moreno lab 10 3/20/19

public class MySelectionSort {
    public static void selSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if ( arr[index]   > arr[i]    )
                    index = j;
      
            int smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
}
}
