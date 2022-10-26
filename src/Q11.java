import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("請輸入月及日為：");
        String date=input.nextLine();
        String[] dateArr=date.split(" ");
        int month=Integer.parseInt(dateArr[0]);
        int day=Integer.parseInt(dateArr[1]);

        String[] constellation={"Capricorn","Aquarius","Pisces","Aries","Taurus","Gemini","Cancer","Leo","Virgo","Libra","Scorpio","Sagittarius","Capricorn"};
        int[] constellationDate={22,21,19,21,21,22,22,23,24,24,24,23,22};
        if (day>constellationDate[month]){
            System.out.println(constellation[month]);
        }else {
            System.out.println(constellation[month-1]);
        }
    }
}
