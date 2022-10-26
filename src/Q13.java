import java.util.Objects;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("請輸入一字元：");
        String str= input.next();
        StringBuilder reverse=new StringBuilder(str);
        String reverseStr=reverse.reverse().toString();
        if (str.equals(reverseStr)){
            System.out.println("Yes");
        }else {
            System.out.println("NO");
        }
    }
}
