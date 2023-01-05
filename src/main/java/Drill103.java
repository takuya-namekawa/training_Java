public class Drill103 {
    public static void main(String[] args) {
        //String型の変数s1に"ABCDEFG"、s2"に"あいうえお"という文字列を格納し、以下の⑴～⑶の
        //
        //処理を順番に行うプログラムを作成してください。プログラムの枠組みをリスト103に、実行結果を図103に示します。
        //
        //　⑴s1とs2の内容を連結した文字列を、変数s3に格納し、その内容を画面に表示する。
        //
        //　⑵s1、s2、s3の長さ(文字列)を画面に表示する。
        //
        //　⑶s1の先頭の文字‘A’、s2の9番目の文字‘い’を取り出して、char型の変数c1、c2、c3に格納し、
        //
        //それぞれの値(文字)を画面に表示する。

        String s1 = "ABCDEFG" , s2 = "あいうえお";
        String s3 = s1 + s2;
        System.out.println("文字列を連結します" + " "+ s3);

        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s3.length());

        char c1 = s1.charAt(0);
        char c2 = s2.charAt(3);
        char c3 = s3.charAt(8);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);


//文字列で一文字取得は以下substringを使い、()で区切って、開始インデックスと終了インデックスを指定すると、その間の文字が反映去れる
/*
        String c1 = s1.substring(0, 1);
        String c2 = s2.substring(3, 4);
        String c3 = s3.substring(8, 9);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
                                            */

    }
}
