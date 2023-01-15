import java.util.*;
public class skill_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;


        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (ans < a) {
                ans = a;
            }
        }
        System.out.println(ans);
    }
}
