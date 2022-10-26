import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        String[] subject={"國文","英文","微積分","體育","程式設計"};
        List score=new ArrayList<>();
        for (int i=0;i<subject.length;i++){
            Scanner sc=new Scanner(System.in);
            System.out.print(subject[i]+":");
            score.add(sc.next());
        }
        float average=0;
        for (int i=0;i< score.size();i++){
            average+=Float.parseFloat(score.get(i).toString());
        }
        average=average/subject.length;
//        System.out.println();
//        System.out.println(average);
        System.out.printf("平均分數:%.2f%n最高分科目:%s分%n最低分科目:%s分%n",average,subject[score.indexOf(Collections.max(score))]+Collections.max(score),subject[score.indexOf(Collections.min(score))]+Collections.min(score));
    }
}
