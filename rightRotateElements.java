public class rightRotateElements {
    public static void main(String[] args){
        int arr[] = new int[] {25, 11, 7, 75, 56};
        int n = 1;

        System.out.println("Original array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        for(int i = 0; i < n; i++){
            int j, last;
            last = arr[arr.length - 1];
            for(j = arr.length - 1; j > 0; j--){
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        System.out.println();
        System.out.println("Rotated array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    }
}
