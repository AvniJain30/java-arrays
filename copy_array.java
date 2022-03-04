public class copy_array {
    public static void main(String[] args){
        char arr[] = {'a', 'u', 'a', 'v', 'n', 'i', 'j', 'n', 'b'};
        char arr1[] = new char[4];

        System.arraycopy(arr,2, arr1,0,4);
        System.out.println(String.valueOf(arr1));
    }
}
