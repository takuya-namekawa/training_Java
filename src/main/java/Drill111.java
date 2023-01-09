import java.util.*;
public class Drill111 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String array[][] = new String[7][6];

        array[0][0] = "曜日";
        array[0][1] = " " + "1";
        array[0][2] = "  " + "2";
        array[0][3] = "  " + "3";
        array[0][4] = "  " + "4";
        array[0][5] = "  " + "5";

        array[1][0] = " " +"月";
        array[1][1] = "国語";
        array[1][2] = "算数";
        array[1][3] = "理科";
        array[1][4] = "社会";
        array[1][5] = "英語";

        array[2][0] = " " +"火";
        array[2][1] = "算数";
        array[2][2] = "英語";
        array[2][3] = "体育";
        array[2][4] = "国語";
        array[2][5] = "保健";

        array[3][0] = " " +"水";
        array[3][1] = "社会";
        array[3][2] = "英語";
        array[3][3] = "算数";
        array[3][4] = "技家";
        array[3][5] = "技家";

        array[4][0] = " " +"木";
        array[4][1] = "理科";
        array[4][2] = "算数";
        array[4][3] = "理科";
        array[4][4] = "体育";
        array[4][5] = "社会";

        array[5][0] = " " +"金";
        array[5][1] = "国語";
        array[5][2] = "算数";
        array[5][3] = "理科";
        array[5][4] = "美術";
        array[5][5] = "美術";

        array[6][0] = " " +"土";
        array[6][1] = "英語";
        array[6][2] = "数学";
        array[6][3] = "国語";
        array[6][4] = "　";
        array[6][5] = "　";




        for (String item[] : array) {
            for (String item2 : item) {
                System.out.print(item2 + " ");

            }
            System.out.println("");

        }





        System.out.println(array[0][0]);




//        for (int i = 0; i < array.length; i++){
//            for (int j = 0; j < array[i].length; j++){
//                System.out.print(array[i]);
//                System.out.print(array[j]);
//            }
//        }
    }
}
