import java.util.*;

public class Q12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("輸入一整數序列為：");
        String row= input.nextLine();
        String[] rowArr=row.split(" ");

        List rowList=new ArrayList<>();
        for(String i:rowArr){
            rowList.add(i);
        }
        String element="";
        String number="";
        for (Object i:rowList){
            if (Collections.frequency(rowList,i)>(rowList.size()/2) && !Objects.equals(number, i)){
                number=(String) i;
                element+=i;
                element+=" ";
            }
        }
        if (element==""){
            System.out.printf("過半元素為：NO");
        }else {
            System.out.printf("過半元素為：%s",element);
        }
    }
}
