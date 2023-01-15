import java.util.*;
public class skill_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "paiza";

        for (int i = 0; i <  n - 1; i++){
            ans += " paiza";
        }
        System.out.println(ans);

    }
}
