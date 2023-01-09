import java.util.Scanner;

public class Drill111_2 {

    //以下に示した中学校の時間割表を2次元配列として作成し(プログラムの中にデータを記述し)、
    //
    //キー入力で指定した曜日と時間を指定すると該当する科目を画面に表示する、というプログラムを作成してください。
    //
    //月~土の曜日は、1~6の数値で指定するとします。時間は1~5で指定します。
    //
    //曜日と時間を指定する処理の前に、for文による多重ループを使って、時間割表全体を画面に表示します。
    //
    //リスト111にプログラムの枠組みを、図111にプログラムの実行結果の例を示します。
    //
    //
    //
    //ーーーーーーーーーーーーーーーーーーーーーーーーーーー
    //
    //曜日　　　１　　　　２　　　　３　　　　４　　　　５
    //
    //月　　　　国語　　　算数　　　理科　　　社会　　　英語
    //
    //火　　　　算数　　　英語　　　体育　　　国語　　　保健
    //
    //水　　　　社会　　　英語　　　算数　　　技家　　　技家
    //
    //木　　　　理科　　　算数　　　理科　　　体育　　　社会
    //
    //金　　　　国語　　　算数　　　理科　　　美術　　　美術
    //
    //土　　　　英語　　　数学　　　国語
    //
    //ーーーーーーーーーーーーーーーーーーーーーーーーーーー
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String array[][] = new String[7][6];

        array[0][0] = "曜日";
        array[0][1] = " " + "1";
        array[0][2] = "  " + "2";
        array[0][3] = "  " + "3";
        array[0][4] = "  " + "4";
        array[0][5] = "  " + "5";

        array[1][0] = "1.月";
        array[1][1] = "国語";
        array[1][2] = "算数";
        array[1][3] = "理科";
        array[1][4] = "社会";
        array[1][5] = "英語";

        array[2][0] = "2.火";
        array[2][1] = "算数";
        array[2][2] = "英語";
        array[2][3] = "体育";
        array[2][4] = "国語";
        array[2][5] = "保健";

        array[3][0] = "3.水";
        array[3][1] = "社会";
        array[3][2] = "英語";
        array[3][3] = "算数";
        array[3][4] = "技家";
        array[3][5] = "技家";

        array[4][0] = "4.木";
        array[4][1] = "理科";
        array[4][2] = "算数";
        array[4][3] = "理科";
        array[4][4] = "体育";
        array[4][5] = "社会";

        array[5][0] = "5.金";
        array[5][1] = "国語";
        array[5][2] = "算数";
        array[5][3] = "理科";
        array[5][4] = "美術";
        array[5][5] = "美術";

        array[6][0] = "6.土";
        array[6][1] = "英語";
        array[6][2] = "数学";
        array[6][3] = "国語";
        array[6][4] = "　";
        array[6][5] = "　";

        int day, time;
        for (day = 0; day < array.length; day++) {
            for (time = 0; time < array[day].length; time++) {
                System.out.print(array[day][time] + " ");
            }
            System.out.println("");
        }

        System.out.println("曜日の出力　1-6まで選んでください");
        day = scn.nextInt();

        System.out.println("時間の出力　1-5まで選んでください");
        time = scn.nextInt();

        System.out.println("選んだ科目は" + array[day][time]);
    }
}
