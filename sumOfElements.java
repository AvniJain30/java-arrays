public class sumOfElements {
    public static void main(String[] args){
        int arr[] = new int[] {25, 11, 7, 75, 56};

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
