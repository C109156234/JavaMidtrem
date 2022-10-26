import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        String[][] sData={
                {"123","Tom","DTGD"},
                {"456","Cat","CSIE"},
                {"789","Nana","ASIE"},
                {"321","Lim","DBA"},
                {"654","Won","FDD"}};
        Scanner input=new Scanner(System.in);
        System.out.print("輸入查詢學號為：");
        String sid=input.next();

        String output="";
        for (int i=0;i<sData.length;i++){
            if (sid.equals(sData[i][0])){
                output=Arrays.deepToString(sData[i]).replace(",","");
                output=output.replace("[","");
                output=output.replace("]","");
                break;
            }
        }
        System.out.println("學生資料為："+output);
    }
}
