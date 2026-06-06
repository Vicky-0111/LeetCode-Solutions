import java.util.*;
public class TransposeMatrix {
    public static void print(int matrix[][]){
        int row = matrix.length; 
        int col = matrix[0].length;

        int transpose[][] = new int[col][row];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        
        for(int i = 0; i < col; i++){
            for(int j = 0; j < row; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[2][3];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        print(matrix);
    }
}