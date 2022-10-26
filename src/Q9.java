import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Scanner input2=new Scanner(System.in);
        System.out.print("輸入s1為：");
        String s1=input.next();
        System.out.print("輸入s2為：");
        String s2=input2.next();
        if (s2.contains(s1)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
