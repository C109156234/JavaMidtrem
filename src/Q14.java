import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("輸入一字串為：");
        String str= input.nextLine();
        System.out.printf("There are %d characters",str.length());
    }
}
