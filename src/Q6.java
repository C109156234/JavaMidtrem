import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("輸入值為；");
        String getInput= input.next();
        String[] s=getInput.split(",");

        Arrays.sort(s);
        String min="";
        for (String i:s){
            min+=i;
        }
        String max="";
        for (int j=s.length-1;j>=0;j--){
            max+=s[j];
        }
        int answer=Integer.parseInt(max)-Integer.parseInt(min);
        System.out.printf("最大值數列與最小值數列差值為：%d",answer);
    }
}
