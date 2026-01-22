// observation - for every max element their won't be any element greater than that.
// max - 5

import java.util.Scanner;

class findbig{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter No. of Elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            System.out.print("Enter Element : ");
            arr[i] = sc.nextInt();
        }

        int max = FindMax(arr);
        int equal = findEqual(arr, max);
        int length = FindOthers(arr,equal);
        System.out.println(length);

        sc.close();
    }

    static int FindMax(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;++i){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    static int findEqual(int[] arr,int max){
        int c = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                c+=1;
            }
        }
        return c;
    }

    static int FindOthers(int[] arr,int equal){
        return (arr.length - equal);
    }
}