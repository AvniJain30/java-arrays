import java.util.Scanner;

public class typeCastingAsciiValue {
    public static void main(String[] args){
        System.out.println("Enter a character: ");
        Scanner s = new Scanner(System.in);
        char ch = s.next().charAt(0);
        int c = ch;
        System.out.println("ASCII value of " + ch + " is " + c);
    }
}
