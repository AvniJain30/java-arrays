public class toCheckIsPalindrome {
    public static boolean isPalindrome(String word){
        char charArr[] = word.toCharArray();
        int start = 0;
        int end = charArr.length - 1;
        while(start < end){
            if(charArr[start] != charArr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){
        if(isPalindrome("ghjk")){
            System.out.println("palindrome!!");
        }
        else{
            System.out.println("not palindrome!!");
        }
    }
}
