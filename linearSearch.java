import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = 0;

        System.out.print("Enter No. of Elements of Array: ");
        int num = sc.nextInt();
        System.out.println();

        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            System.out.print("Enter your Element "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        
        System.out.print("enter key to find: ");
        int key = sc.nextInt();
        System.out.println();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                count+=1;
            }
        }

        if(count!=0){
            System.out.print("Element Fount!");
        }
        else{
            System.out.print("Element Not Found!");
        }
        System.out.println();
        sc.close();
    }
}
