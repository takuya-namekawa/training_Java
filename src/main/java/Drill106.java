import java.util.*;
public class Drill106 {
    public static void main(String[] args) {
        //キーボードから月を意味する整数を変数monthに入力し、その値が３、４、５なら「春です。」、６、７、８なら「夏です。」、９、１０、１１なら「秋です。」、１２、１、２なら「冬です。」、その他の場合は「入力エラーです！」と画面に表示するプログラムを、switch文を使って作成してください。
        Scanner scn  = new Scanner(System.in);
        int month = scn.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("春です");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏です");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋です");
                break;
            case 12:
            case  1:
            case  2:
                System.out.println("冬です");
                break;
            default:
                System.out.println("入力エラーです");
                break;
        }
    }
}
