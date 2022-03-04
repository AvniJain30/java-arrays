public class thirdLargestNo {
    public static int thirdLargest(int a[], int total){
        int temp = 0;
        for(int i = 0; i < total; i++){
            for(int j = i + 1; j < total; j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total - 3];
    }

    public static void main(String[] args){
        int a[] = {11, 56, 7, 75, 25};
        System.out.println(thirdLargest(a,5));
    }
}
