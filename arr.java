import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Element to make Array length: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter"+i+"th Element: ");
            arr[i] = sc.nextInt();
        }
        findMaxMin(arr);
        printReverse(arr);
        sc.close();
    }
    
    static void findMaxMin(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for(int i=1;i<=arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            else if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Largest Element is :"+max);
        System.out.println("Smallest Element is :"+min);
    }

    static void printReverse(int[] arr){
        for(int i=arr.length;i>0;--i){
            System.out.print("["+arr[i]+" ");
        }
        System.out.println("]");
    }
}
