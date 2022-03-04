public class countEvenOddInMatrix {
    public static void main(String[] args){
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int row = a.length;
        int column = a[0].length;
        int counteven = 0, countodd = 0;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                if(a[i][j] % 2 == 0){
                    counteven++;
                }
                else{
                    countodd++;
                }
            }
        }

        System.out.println("Frequency of even no. : " + counteven);
        System.out.println("Frequency of odd no. : " + countodd);
    }
}
