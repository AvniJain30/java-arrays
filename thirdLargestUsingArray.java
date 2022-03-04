import java.util.*;
public class thirdLargestUsingArray {
    public static int thirdLargest(int a[], int total){
        Arrays.sort(a);
        return a[total - 3];
    }
    public static void main(String[] args){
        int a[] = {11, 25, 7, 75, 56};
        System.out.println(thirdLargest(a,5));
    }
}
