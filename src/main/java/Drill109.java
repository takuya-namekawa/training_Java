import java.util.*;
public class Drill109 {
    //5人の学生のテストの特典をキー入力し、平均値を求めるプログラムを作成してください。テストの得点は、int型の1次元配列に格納します。平均値は、小数点以下の値も表示されるように、データをdouble型にキャストして計算します。繰り返し処理には、for文を使います。
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int avg;
        avg = 0;

        int num = 5;
        int point[] = new int[5];

        for (int i = 0; i < num; i++) {
            System.out.println("得点を入力してください");
            point[i] = scn.nextInt();
            avg += point[i];
        }
        System.out.println("平均値=" + (double)avg / 5);



    }
}
