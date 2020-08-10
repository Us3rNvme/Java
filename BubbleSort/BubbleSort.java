import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int amountOfElements;
        System.out.print("Enter amount of elements of array: " );
        amountOfElements = in.nextInt();

        int[] arr = new int[amountOfElements];

        System.out.println("Array before bubble sort");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (2000 + 1)) - 1000;
            System.out.print(arr[i] + " ");
        }

        bubbleSort(arr);

        System.out.println("\n\nArray after bubble sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
