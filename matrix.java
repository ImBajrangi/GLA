import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter no. of Columns:");
        int column = sc.nextInt();

        int[][] matrix = makeMatrix(row,column);
        int[][] matrix2 = makeMatrix(row,column);

        printMatrix(matrix);
        printMatrix(matrix2);
        
        int[][] addedMatrix = addMatrix(matrix,matrix2);
        printMatrix(addedMatrix);

        int diagonalSm = diagonalSum(matrix);
        System.out.println(diagonalSm);

        sc.close();
    }

    static int[][] makeMatrix(int row,int column){
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print("Enter Element: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return matrix;
    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("]");
        }
    }

    static int[][] addMatrix(int[][] mat1, int[][] mat2){
        int[][] FinalMatrix = new int[mat1.length][mat1[0].length];
        for(int i=0;i<mat1[0].length;i++){
            for(int j=0;j<mat1.length;j++){
                FinalMatrix[i][j] = mat1[i][j]+mat2[i][j];
            }
        }
        return FinalMatrix;
    }

    static int diagonalSum(int[][] matrix){
        int dignlSum = 0;
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                if(i==j){
                    dignlSum += matrix[i][j];
                }
            }
        }
        return dignlSum;
    }
}
