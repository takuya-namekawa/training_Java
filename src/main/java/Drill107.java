import java.util.*;
public class Drill107 {
    public static void main(String[] args) {
        //キー入力された2つの整数a、bの最大公約数を求めるプログラムを、while文を使って作成してください。最大公約数は、「2つの整数の大きい方から小さい方を引くことを、両者が等しくなるまで繰り返す。等しくなった値が、最大公約数である」というアルゴリズム(ユークリッドの互除法)で求められます。
        Scanner scn = new Scanner(System.in);
        int a, b;

        System.out.println("1つ目の整数を入力してください");
        a = scn.nextInt();
        System.out.println("2つ目の整数を入力してください");
        b = scn.nextInt();


        while (a != b) {  //お互いの数を引き算した結果同じになるまで計算するのだから、まず前提条件は同じじゃないという条件を付ける
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }

        System.out.println("最大公約数は" + a);


    }
}
