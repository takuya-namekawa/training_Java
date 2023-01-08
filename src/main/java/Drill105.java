import java.util.*;
public class Drill105 {
    public static void main(String[] args) {
      //「西暦が４で割り切れ」、かつ、100で割り切れないなら、うるう年である。ただし、西暦が400で割り切れたら、うるう年である」
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();

        if (year % 4 == 0 & year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "年はうるう年です");
        } else
            System.out.println("うるう年ではありません。");
    }
}
