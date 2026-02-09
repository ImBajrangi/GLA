// Given an integer array 'a' you have to find the second largest element in the array. and report that no such element exists.

import java.util.Scanner;

public class SecondlargestItem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter Element: ");
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        sc.close();
    }
    
    static int ScndLargest(int[] arr,int max){
        // int ScndMax;
        int[] diff = new int[arr.length];
        int small = max - arr[0];

        for(int i=0;i<arr.length;i++){
            diff[i] = max-arr[i];

            if(diff[i] <= small && diff[i] != 0){
                small = diff[i];
            }
        }        
        return small;
    }
}
