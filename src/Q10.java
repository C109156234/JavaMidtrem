import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner inputNM=new Scanner(System.in);
        System.out.print("輸入N及M為：");
        String nm=inputNM.nextLine();
        String[] nm_arr=nm.split(" ");
        int n=Integer.parseInt(nm_arr[0]);
        int m=Integer.parseInt(nm_arr[1]);
        //matrix
        int[][] matrix=new int[n][m];
        for (int i=0;i<n;i++){
            Scanner input=new Scanner(System.in);
            System.out.printf("輸入矩陣數值第%d列為：",i+1);
            String getInput= input.nextLine();
            String[] row=getInput.split(" ");
            for (int j=0;j<m;j++){
                matrix[i][j]=Integer.parseInt(row[j]);
            }
        }
        //transpose
        int[][] transpose=new int[m][n];
        for (int i=0;i<m;i++){
            String ans="";
            for (int j=0;j<n;j++){
                transpose[i][j]=matrix[j][i];
                ans+=Integer.toString(transpose[i][j]);
            }
            System.out.printf("輸出矩陣數值第%d列為：%s%n",i,ans);
        }
    }
}
