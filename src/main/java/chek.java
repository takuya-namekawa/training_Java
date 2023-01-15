import java.util.*;
public class chek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stringWithRandomChars = sc.next();

        String finalString = stringWithRandomChars
                .replace("a", "")
                .replace("e", "")
                .replace("i", "")
                .replace("o", "")
                .replace("u", "")
                .replace("A", "")
                .replace("E", "")
                .replace("I", "")
                .replace("O", "")
                .replace("U", "");

        System.out.println(finalString);
    }
}
