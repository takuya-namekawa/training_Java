import java.util.*;
public class Drill113_2 {
    public static double daikei(double joutei, double katei, double takasa) {
        double menseki;
        menseki = (joutei + katei) * takasa / 2.0;

        return menseki;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double a, b ,c, ans;

        System.out.println("上底を入力してください");
        a = scn.nextDouble();
        System.out.println("下底を入力してください");
        b = scn.nextDouble();
        System.out.println("高さを入力してください");
        c = scn.nextDouble();

        ans = daikei(a, b, c);

        System.out.println("面積=" + ans);

    }
}
