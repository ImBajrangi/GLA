import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of elements: ");
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter Element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are:");

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.print("Enter key to search: ");
        int key = sc.nextInt();
        int result = binarySearch(arr, key);
        System.out.println(result);
        
        sc.close();
    }

    static int binarySearch(int[] arr,int key){
        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            int mid = left+(right-left)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }
}
