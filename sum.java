// WAP to create an array and display it on display screen.

// WAP to take input from user in an Array and display it on screen.

import java.util.Scanner;

public class sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. of Array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            System.out.print("enter your element: ");
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<num;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // WAP to insert an element in an Array.
        // At beginning of Array
        // At end of Array
        // At particular index

        System.out.print("Enter Value to Insert at Beginning: ");
        int ins = sc.nextInt();
        int[] newArr = new int[num+1];
        newArr[0] = ins;
        for(int i=0;i<num;i++){
            newArr[i+1] = arr[i];
        }

        System.out.println("Array after Insertion at Beginning: ");
        for(int i=0;i<num+1;i++){
            System.out.print(newArr[i]+" ");
        }
        System.out.println();

        System.out.print("Enter Value to Insert at End: ");
        int insEnd = sc.nextInt();
        int[] newArrEnd = new int[num+1];
        for(int i=0;i<num;i++){
            newArrEnd[i] = arr[i];
        }
        newArrEnd[num] = insEnd;
        
        System.out.println("Array after Insertion at End: ");
        for(int i=0;i<num+1;i++){
            System.out.print(newArrEnd[i]+" ");
        }
        System.out.println();

        System.out.print("Enter Value to Find: ");
        int c=sc.nextInt();
        System.out.println(findArr(arr,c));

        System.out.print("Enter position to insert (0-based): ");
        int pos = sc.nextInt();
        System.out.print("Enter value to insert: ");
        int val = sc.nextInt();
        int[] ar = insertAtIndex(arr, pos, val);
        System.out.println("Array after insertion:");
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        sc.close();
    }

    public static int findArr(int[] arr, int chck){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==chck){
                c+=1;
            }
        }
        return c;
    }

    public static int[] insertAtIndex(int[] arr, int pos, int val){
        // if(pos < 0) pos = 0;
        // if(pos > arr.length) pos = arr.length;

        int[] nwArr = new int[arr.length+1];
        for(int i=0;i<pos;i++){
            nwArr[i] = arr[i];
        }
        nwArr[pos] = val;
        for(int i=pos;i<arr.length;i++){
            nwArr[i+1] = arr[i];
        }
        return nwArr;
    }
    public static int[] DltAtIndex(int arr[], int val){
        int[] nwArr = new int[arr.length-1];
        for (int i=0;i<nwArr.length;i++) {
            if(arr[i] == val){
                continue;
            }
            nwArr[i] = arr[i];
        }
        return nwArr;
    }
}


// WAP to insert an element in an Array.
// At beginning of Array
// At end of Array
// At particular index



// WAP to delete an element from an Array.
// At beginning of Array
// At end of Array
// At particular index