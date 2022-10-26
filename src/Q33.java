import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        System.out.print("sA:");
        String sA= sc.next();
        System.out.print("sB:");
        String sB= sc2.nextLine();
        if (sB.contains(sA)){
            System.out.println("子字串判斷為：Yes");
        }else {
            System.out.println("子字串判斷為：No");
        }
    }
}
