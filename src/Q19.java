import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner inputG=new Scanner(System.in);
        System.out.print("組數為：");
        int g= inputG.nextInt();
        String output="";
        for (int i=0;i<g;i++){
            Scanner sc=new Scanner(System.in);
            System.out.printf("第%d組：",i+1);
            int full=sc.nextInt();int half= sc.nextInt();
            output+=String.format("第%d組應收費用：%d%n",i+1,full*250+half*175);
        }
        System.out.println(output);
    }
}
