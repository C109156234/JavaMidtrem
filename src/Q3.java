import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        String[] zodiac={"monkey","rooster","dog","pig","rat","ox","tiger","rabbit","dragon","snake","horse","goat"};
        Scanner input=new Scanner(System.in);
        System.out.print("請輸入西元年；");
        int year= input.nextInt();
        System.out.println(zodiac[year%12]);
    }
}
