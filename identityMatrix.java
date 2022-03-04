public class identityMatrix {
    public static void main(String[] args){
        int a[][] = {{1,0,0},{0,1,0},{0,0,1}};
        int rows = a.length;
        int columns = a[0].length;
        boolean bool = true;

        if(rows != columns){
            System.out.println("Matrix must be square matrix!");
        }
        else{
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < columns; j++){
                    if(i == j && a[i][j] != 1){
                        bool = false;
                        break;
                    }
                    if(i != j && a[i][j] != 0){
                        bool = false;
                        break;
                    }
                }
            }

            if(bool){
                System.out.println("Matrix is identical");
            }
            else{
                System.out.println("Matrix is not identical");
            }
        }
    }
}
