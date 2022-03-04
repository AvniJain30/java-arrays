public class sparseMatrix {
    public static void main(String[] args){
        int a[][] = {{1,0,0},{0,4,0},{0,0,8}};
        int rows = a.length;
        int columns = a[0].length;

        int size,count = 0;
        size = rows * columns;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(a[i][j] == 0){
                    count++;
                }
            }
        }

        if(count > size / 2){
            System.out.println("Matrix is sparse!");
        }
        else{
            System.out.println("Matrix is not sparse!");
        }
    }
}
