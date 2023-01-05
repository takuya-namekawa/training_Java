public class Drill104 {
    public static void main(String[] args) {
        //⑴double型の変数aとbに格納された10.0と3.0の除算結果を、int型の変数zに格納し、変数zの値を画面に表示する。 　
        //
        //⑵int型の変数xとyに格納された10と3の除算結果を、double型の変数cに格納し、変数cの値を画面に表示する。 　
        //
        //⑶char型の変数mojiに格納された文字データ‘A’を、int型の変数codeに格納し、変数codeの値(文字コード)を画面に表示する。 　
        //
        //⑷int型の変数に格納された文字コードを70を、char型の変数mojiに格納し、変数mojiの値(文字)を画面に表示する。


        double a = 10.0, b = 3.0;
        int z = (int)(a % b);

        System.out.println("doubleをintに変換する" + z);

        int x = 10, y = 3;
        double c = (double)(x % y);

        System.out.println("intをdoubleに変換する" + c);

        char moji = 'A';
        int code = (int)(moji);
        System.out.println("文字コードとして出力される" + code);

        int mojicode = 70;
        char cmoji = (char)(mojicode);
        System.out.println("文字コードを文字に変換する" + cmoji);
    }
}
