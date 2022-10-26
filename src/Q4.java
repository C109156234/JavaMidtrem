import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner inputX=new Scanner(System.in);
        Scanner inputY=new Scanner(System.in);
        System.out.print("X軸座標：");
        int x= inputX.nextInt();
        System.out.print("Y軸座標：");
        int y= inputY.nextInt();

        int distance=(int)(Math.pow(x,2)+Math.pow(y,2));
        if (x==0 && y==0){
            System.out.println("該點位於原點");
        } else if (x==0) {
            if (y>0){
                System.out.printf("該點位於上半平面Y軸上，離原點距離為根號%d",distance);
            }else {
                System.out.printf("該點位於下半平面Y軸上，離原點距離為根號%d",distance);
            }
        } else if (y==0) {
            if (x>0){
                System.out.printf("該點位於右半平面X軸上，離原點距離為根號%d",distance);
            }else {
                System.out.printf("該點位於左半平面X軸上，離原點距離為根號%d",distance);
            }
        } else if (x>0 && y>0) {
            System.out.printf("該點位於第一象限，離原點距離為根號%d",distance);
        } else if (x<0 && y>0) {
            System.out.printf("該點位於第二象限，離原點距離為根號%d",distance);
        } else if (x<0 && y<0) {
            System.out.printf("該點位於第三象限，離原點距離為根號%d",distance);
        }else {
            System.out.printf("該點位於第四象限，離原點距離為根號%d",distance);
        }
    }
}
