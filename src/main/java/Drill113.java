import java.util.*;
public class Drill113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        daikei(a ,b ,c);

       // daikei(double a, b, c);
        //台形の面積を求める daikei メソッドと、daikeiメソッドを呼び出すmainメソッドから構成されたプログラムを作成してください。
        //
        //daikeiメソッドの引数には、台形の上底、下底、高さを指定します。
        //
        //daikeiメソッドは、戻り値として台形の面積を返します。
        //
        //mainメソッドでは、上底、下底、高さをキー入力して、それらの値を引数に指定してdaikeiメソッドを呼び出し、daikeiメソッドの戻り値を画面に表示します。
    }

    public static void daikei(double a, double b, double c) {
        System.out.println((a + b) * c / 2);
    }
}
