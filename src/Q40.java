import java.util.Scanner;

public class Q40 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("搭了幾次電梯：");
        int t= sc.nextInt();
        int floor=1;
        int m=0;
        for (int i=0;i<t;i++){
            Scanner sc2=new Scanner(System.in);
            int arrive=sc2.nextInt();
            if (arrive>floor){
                m+=(arrive-floor)*20;
            }else {
                m+=(floor-arrive)*10;
            }
            floor=arrive;
        }
        System.out.printf("%d元",m);
    }
}
