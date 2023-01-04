import java.util.*;
public class sample_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("身長を入力してください");
        double height = scn.nextDouble();
        System.out.println("体重を入力してください");
        double weight = scn.nextDouble();

        height = height / 100;
        double BMI = weight / height / height;
        System.out.println("あなたのBMIは");
        System.out.println(BMI + "です");

        if(BMI > 25) {
            System.out.println("肥満です");
        } else {
            System.out.println("標準です");
        }
    }
}


//身長の話　170cmをmの単位に直すと1.7m
//という事は170を100で割れば1.7になる

//キーボードから入力した二つの数値の四則演算結果を表示するプログラムです
//キーボードから身長と体重を入力してBMIを示せ
//BMI = 体重　÷　身長(m) ÷ 身長(m)　で計算する