import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("檢測的字串(end結束)：");
        String str=sc.nextLine();
        while (!(str.equals("end"))){
            Scanner sc2=new Scanner(System.in);
            System.out.print("檢測的單一字元：");
            String s= sc2.next();
            String  str2=str.replace(s,"");
            System.out.printf("字元%s出現的字數為：%d%n",s,str.length()-str2.length());
            Scanner scAgain=new Scanner(System.in);
            System.out.print("檢測的字串(end結束)：");
            str=scAgain.nextLine();
        }
        System.out.println("檢測結束");
    }
}
