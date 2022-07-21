public class findMissingNo {
    public static int findMissingNo(int arr[]){
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for(int num : arr){
            sum = sum - num;
        }
        return sum;
    }
    public static void main(String[] args){
        int arr[] = {1, 3, 5, 4};
        System.out.println(findMissingNo(arr));
    }
}
