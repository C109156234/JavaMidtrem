import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("請輸入階乘值：");
        int m= input.nextInt();

        int n=1;
        int factorial=1;
        while(factorial<m){
            factorial*=++n;
        }
        System.out.printf("超過M為%d的最小階乘N值為：%d",m,n);
    }
}
