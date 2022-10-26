import java.awt.*;
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("輸入一組四位數字為：");
        int n=input.nextInt();

        int[] nArr=new int[4];
        int remainder=n;int divisor=1000;
        for (int i=0;i<4;i++){
            nArr[i]=remainder/divisor;
            remainder=remainder%divisor;
            divisor/=10;
        }

        int tem=nArr[0];
        nArr[0]=nArr[2];nArr[2]=tem;
        tem=nArr[1];
        nArr[1]=nArr[3];nArr[3]=tem;
        String ans="";
        for (int s:nArr){
            s=(s+7)%10;
            ans+=Integer.toString(s);
        }
        System.out.println("輸出加密後的數字為："+ans);
    }
}
