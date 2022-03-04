public class array {
    public static void main(String[] args){
        int a[] = {2, 5, 67, 56};
        int c = 5, d = 0;

        for (int i = 0; i < a.length; i++){
               if(c == a[i]){
                   d = 1;
               }
        }
       if(d == 1){
           System.out.println("found");
       }
       else{
           System.out.println("not found");
       }
    }
}
