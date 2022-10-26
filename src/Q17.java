import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("");
        String[] cards=input.nextLine().split(" ");

        int sum=0;
        for (String i: cards){
            if (i.equals("A")){
                sum+=1;
            }else if (i.equals("J")) {
                sum+=11;
            }else if (i.equals("Q")) {
                sum+=12;
            }else if (i.equals("K")) {
                sum+=13;
            }else {
                sum+=Integer.parseInt(i);
            }
        }

        System.out.println(sum);
    }
}
