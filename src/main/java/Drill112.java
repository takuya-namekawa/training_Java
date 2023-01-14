public class Drill112 {
    public static void main(String[] args) {
        //拡張for文を使って、1次元配列および2次元配列に格納されているすべてのデータを1つずつ順番に取り出して画面に表示するプログラムを作成してください。
        //
        //1次元配列fruitには、果物の名前を格納しておきます。
        //
        //2次元配列petには、ペットの種類を格納しておきます。リスト112にプログラムの枠組みを、図112にプログラムの実行結果を示します。

        String[] fruit = {"リンゴ", "バナナ", "ミカン", "メロン", "イチゴ"};

        String[][] pet = {
                {"いぬ", "猫", "うさぎ", "りす", "うま"},
                {"錦鯉", "金魚", "めだか", "亀"},
                {"インコ", "オウム", "ハト"}
        };

        for (String fruits : fruit) {
            System.out.print(fruits);
        }


        System.out.println("");

        for (String[] pets : pet) {
            for (String array_pets : pets) {
                System.out.print(array_pets);
            }
        }
    }
}
