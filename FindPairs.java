// Given an array element if their exist a pair (i,j) such that arr[i]+arr[j]=k and i!=j 
// i and j are indexes of the array and k is a given sum. 

import java.util.Scanner;

public class FindPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter Your Element: ");
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the target sum: ");
        
        int k = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k && i!=j){
                    System.out.println("Pair found: ("+arr[i]+","+arr[j]+")");
                }
            }
        }
        sc.close();
    }
}