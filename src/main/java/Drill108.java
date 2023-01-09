import java.util.*;
public class Drill108 {
    //「数当てゲーム」を作成しましょう。コンピューターは、乱数で100から整数を1つ選び、変数numに格納します。ユーザーは、キー入力で、その数を当てます。ユーザーがキー入力した整数ansが正解でない場合は、コンピューターが「もっと大きいです。」または「もっと小さいです。」というヒントを画面に表示します。ユーザーが正解するまで、do～while文で繰り返し処理を行います。正解した場合は、変数numの値と、何回で正解したかをカウントした変数countの値を画面に表示します。
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num, ans, count;
        ans = 0;
        count = 0;

        num = (int)(Math.random() * 100) + 1;
        //System.out.println(num);

        do {
            System.out.println("いくつだとおもいますか？");
            ans = scn.nextInt();
            count++;
            if (ans > num) {
                System.out.println("もっと小さいです");
            } else if (ans < num) {
                System.out.println("もっと大きいです");
            } else {
                System.out.println("正解は" + num + "です");
                System.out.println("あなたは、" + count + "回で正解しました！");
            }
        } while (num != ans);
    }
}
