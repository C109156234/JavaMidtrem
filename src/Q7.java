import java.lang.reflect.Array;
import java.util.Scanner;

public class Q7 {
    public static int countFee(int rType,int time){
        float fee=0;
        switch (rType){
            case 186:
                fee=Math.round((time*0.09f)*1.0f)/1.0f;
                if (fee>=rType*2){
                    fee*=0.8f;
                } else if (fee>=rType) {
                    fee*=0.9f;
                }
                break;
            case 386:
                fee=Math.round((time*0.08f)*1.0f)/1.0f;
                if (fee>=rType*2){
                    fee*=0.7f;
                } else if (fee>=rType) {
                    fee*=0.8f;
                }
                break;
            case 586:
                fee=Math.round((time*0.07f)*1.0f)/1.0f;
                if (fee>=rType*2){
                    fee*=0.6f;
                } else if (fee>=rType) {
                    fee*=0.7f;
                }
                break;
            case 986:
                fee=Math.round((time*0.06f)*1.0f)/1.0f;
                if (fee>=rType*2){
                    fee*=0.5f;
                } else if (fee>=rType) {
                    fee*=0.6f;
                }
                break;
        }
        return  (int)(Math.round(fee*1.0f)/1.0f);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("輸入月租費型式及通話時間為：");
        String s= input.next();
        String[] mRental=s.split(",");

        int fee=countFee(Integer.parseInt(mRental[0]),Integer.parseInt(mRental[1]));
        System.out.printf("通話費為；%d",fee);

    }
}
