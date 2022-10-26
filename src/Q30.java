import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc_m=new Scanner(System.in);
        System.out.print("小明身上有幾元：");
        int m= sc_m.nextInt();

        Scanner sc_drink=new Scanner(System.in);
        System.out.print("販賣機有幾種飲料：");
        int drink= sc_drink.nextInt();

        int kind=0;
        for (int i=0;i<drink;i++){
            Scanner sc_per=new Scanner(System.in);
            if (m>=sc_per.nextInt()){
                kind+=1;
            }
        }
        System.out.println(kind);
    }
}
