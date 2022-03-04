public class lowerTriangularMatrix {
    public static void main(String[] args){
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int row = a.length;
        int column = a[0].length;

        if(row != column){
            System.out.println("Matrix isn't square");
        }
        else{
            for(int i = 0; i < row; i++){
                for(int j = 0; j < column; j++){
                    if(j > i){
                        System.out.print("0 ");
                    }
                    else{
                        System.out.print(a[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
