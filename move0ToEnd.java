public class move0ToEnd {
    public static void printArray(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
    public static void moveZeros(int arr[]){
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0){
                j++;
            }
        }
    }

    public static void main(String[] args){
        int arr[] = { 1, 0, 4, 0, 23, 45, 0};
        moveZeros(arr);
        printArray(arr);
    }
}
