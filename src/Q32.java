import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("輸入一正整數：");
        int integer= sc.nextInt();

        if (integer%2==0 && integer%11==0 && integer%5!=0 && integer%7!=0){
            System.out.printf("%d為新公倍數？ Yes",integer);
        }else {
            System.out.printf("%d為新公倍數？ No",integer);
        }
    }
}
