import java.util.Scanner;

public class Q37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        String ans="";
        for (int i=0;i<n;i++){
            Scanner sc2=new Scanner(System.in);
            int k= sc2.nextInt();
            if (k%9==0 || k%11==0){
                ans+=String.format("第%d個點%d%n",i+1,k);
            }
        }
        System.out.println(ans);
    }
}
