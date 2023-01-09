import java.util.Scanner;

public class Drill109_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int avg;
        avg = 0;


        int point[] = new int[5];

        for (int i = 0; i < point.length; i++) {
            System.out.println("得点を入力してください");
            point[i] = scn.nextInt();
            avg += point[i];
        }

        System.out.println("平均値=" + (double)avg / 5);
//total = (double)avg / point.length;
        //このように書くことで汎用性のある形に出来る　もし配列の番号を変えた時でも動くコードになっている

    }
}
