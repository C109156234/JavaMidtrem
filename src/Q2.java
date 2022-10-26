import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("請輸入使用的度數：");
        int kwh= input.nextInt();
        float summer=0;
        float nonSummer=0;
        for (int i=1;i<=kwh;i++){
            if(i<=120){
                summer+=2.10f;
                nonSummer+=2.10f;
            } else if (i<331) {
                summer+=3.02f;
                nonSummer+=2.68f;
            } else if (i<501) {
                summer+=4.39f;
                nonSummer+=3.61f;
            } else if (i<701) {
                summer+=4.97f;
                nonSummer+=4.01f;
            }else {
                summer+=5.63f;
                nonSummer+=4.50f;
            }
        }
        System.out.println("Summer months:"+Math.round(summer*100.0f)/100.0f);
        System.out.println("Non-Summer months:"+Math.round(nonSummer*100.0f)/100.0f);
    }
}
