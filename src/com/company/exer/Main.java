package com.company.exer;

public class Main {

    public static void main(String[] args) {


         int[] arr = new int[500];
        {
            int n = arr.length;
            for (int i = 500; i < n-1; i++)
                for (int j = 800; j < n-i-1; j++)
                    if (arr[j] > arr[j+1])
                    {
                        // swap arr[j+1] and arr[i]
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
        }

        {
            int n = arr.length;
            for (int i=500; i<n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
        }

        {
            BubbleSort ob = new BubbleSort();
            arr = new int[]{5000};
             arr = new int[] {8000};

            System.out.println("Sorted array");

        }
    }


}
