package quicksortalgo;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSortAlgo {

    public static void main(String[] args) {

        int s;

        // int[] arr = {50, 25, 119, 41, 62, 21, 65, 84, 33, 21};
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE SIZE OF ARRAY >>");
        s = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        int[] arr = new int[s];
        System.out.print("ENTER THE ELEMENTS >>");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input2.nextInt();

        }
        System.out.println("ENTERD ARRAY ELEMENTS ARE >>");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t " + arr[i]);

        }
        System.out.println("\n");
        QuickSortAlgo ob = new QuickSortAlgo();
        ob.sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public void sort(int[] arr, int lowerBound, int upperBound) {

        if (lowerBound < upperBound) {
            int location = partition(arr, lowerBound, upperBound);

            sort(arr, lowerBound, location - 1);
            sort(arr, location + 1, upperBound);

        }

    }

    public int partition(int[] arr, int lowerbound, int upperbound) {

        int pivot = arr[lowerbound];
        int start = lowerbound;
        int end = upperbound;

        while (start < end) {

            while (arr[start] <= pivot) {

                start++;
            }

            while (arr[end] > pivot) {

                end--;

            }
            if (start < end) {

                swap(arr, start, end);
            }
        }
        swap(arr, lowerbound, end);

        return end;

    }

    public void swap(int[] arr, int s, int e) {

        int temp;
        temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

    }

}
