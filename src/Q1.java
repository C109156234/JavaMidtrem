import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("請輸入正整數：");
        String str=input.next();
        int max_Prime_numbers=0;
        //find max Prime numbers
        for (int i=0;i<str.length();i++){
            for (int j=i+1;j<str.length()+1;j++){
                int subString=Integer.parseInt(str.substring(i,j));
                if (subString%2==0){
                    continue;
                }
                for (int k=3;k<subString;k++){
                    if (subString%k==0){
                        break;
                    }
                    else {
                        if (subString>max_Prime_numbers){
                            max_Prime_numbers=subString;
                        }
                    }
                }
            }
        }
        //print answer
        if (max_Prime_numbers==0){
            System.out.print("No prime found");
        }else {
            System.out.printf("子字串中最大的質數為：%d",max_Prime_numbers);
        }
    }
}
