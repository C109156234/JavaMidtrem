import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> pwMap=new HashMap<>(){{
            put(123,456);
            put(456,789);
            put(789,888);
            put(336,558);
            put(775,666);
            put(566,221);
        }};
        HashMap<Integer,Integer> money=new HashMap<>(){{
            put(123,9000);
            put(456,5000);
            put(789,6000);
            put(336,10000);
            put(775,12000);
            put(566,7000);
        }};

        Scanner input=new Scanner(System.in);
        System.out.print("輸入查詢組數為：");
        int n=input.nextInt();
        String ans="";
        for (int i=0;i<n;i++){
            Scanner sc=new Scanner(System.in);
            int ac= sc.nextInt();
            int pw= sc.nextInt();
            if (pwMap.containsKey(ac)){
                if (pwMap.get(ac)==pw){
                    ans+=String.format("%d%n",money.get(ac));
                }
                else {
                    ans+=String.format("error%n");
                }
            }else {
                ans+=String.format("error%n");
            }
        }
        System.out.print(ans);
    }
}
