import java.util.Scanner;

public class Q39 {
    public static void blank(int blank){
        int i=0;
        while (i<blank/2){
            System.out.print(" ");
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String ans="";
        for (int i=1;i<n;i+=2){
            blank(n);
            ans+=i;
            System.out.println(i);
        }
        StringBuilder ans_re=new StringBuilder(ans);
        ans=ans+Integer.toString(n)+ans_re.reverse().toString();
        System.out.println(ans);

        for (int j=n-2;j>=0;j-=2){
            blank(n);
            System.out.println(j);
        }
    }
}
