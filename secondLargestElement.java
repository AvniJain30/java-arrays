public class secondLargestElement {
    public static int findSecondLargest(int arr[]){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args){
        int arr[] = {2, 56, 38, 92, 23, 12, 98};
        System.out.println(findSecondLargest(arr));
    }
}
