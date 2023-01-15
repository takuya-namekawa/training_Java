import java.util.*;
public class skill_final_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ninzu = sc.nextInt();

        for (int i = 0; i < ninzu; i++ ) {
            String name = sc.next();
            int nenrei = sc.nextInt();
            nenrei++;
            System.out.println(name + " " + nenrei);
        }

    }
}
