public class sumOfEachRowANdColumn {
    public static void main(String[] args){
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int row = a.length;
        int column = a[0].length;

        for(int i = 0; i < row; i++){
            int sumrow = 0;
            for(int j = 0; j < column; j++){
                sumrow += sumrow + a[i][j];
            }
            System.out.println("Sum of " + (i + 1) + " row is " + sumrow);
        }

        for(int i = 0; i < column; i++){
            int sumcolumn = 0;
            for(int j = 0; j < row; j++){
                sumcolumn += sumcolumn + a[j][i];
            }
            System.out.println("Sum of " + (i + 1) + " column is " + sumcolumn);
        }
    }
}
