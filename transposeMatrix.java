import java.util.Scanner;
public class transposeMatrix {
    public static void main(String[] args){
        System.out.println("Enter total no. of rows and columns: ");
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int columns = s.nextInt();
        int arr[][] = new int[rows][columns];

        System.out.println("Enter Matrix: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                arr[i][j] = s.nextInt();
                System.out.print(" ");
            }
        }

        System.out.println("Original Matrix: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose Matrix: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
