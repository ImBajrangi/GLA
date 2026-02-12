import java.util.Scanner;

class matPater{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        
        int[][] mat = new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.println("Enter the value of mat["+i+"]["+j+"]");
                mat[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(i<j){
                    System.out.print("*"+" ");
                    sum += 1;
                }
            }
            System.out.println();
        }
        System.out.println("Sum of stars: "+sum);
        sc.close();
    }
}