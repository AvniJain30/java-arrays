public class evenOddNo {
    public static void main(String[] args){
        int arr[] = {23, 56, 43, 76, 59, 10};

        System.out.println("Odd numbers: ");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        System.out.println("Even numbers: ");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
