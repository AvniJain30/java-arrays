public class equalMatrix {
    public static void main(String[] args){
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int b[][] = {{1,2,3},{4,5,6},{7,8,9}};

        int rows1 = a.length;
        int columns1 = a[0].length;
        int rows2 = b.length;
        int columns2 = b[0].length;
        boolean bool = true;

        if(rows1 != rows2 || columns1 != columns2){
            System.out.println("Matrix aren't equal!");
        }
        else{
            for(int i = 0; i < rows1; i++){
                for(int j = 0; j < columns1; j++){
                    if(a[i][j] != b[i][j]){
                        bool = false;
                        break;
                    }
                }
            }
        }

        if(bool){
            System.out.println("Matrix are equal!");
        }
        else{
            System.out.println("Matrix are not equal!");
        }
    }
}
