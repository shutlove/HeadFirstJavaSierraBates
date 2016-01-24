/**  * Created by nac999 on 21.01.2015.  */
/*import java.util.Collections;

import java.util.List;
import java.lang.Object;
import java.util.Random;

public class MafiaTurnir {
    public static void (String[] args) {
        String[] wordList = {"Первый", "Второй", "Третий", "Четвёртый", "Пятый", "Шестой", "Седьмой", "Восьмой", "Девятый", "Десятый",
                "Одинадцатый", "Двенадцатый", "Тринадцатый", "Четырнадцатый", "Пятнадцатый", "Шестнадцатый", "Семнадцатый",
                "Восемнадцатый", "Девятнадцатый", "Двадцатый", "Двадцать первый", "Двадцать второй", "Двадцать третий",
                "Двадцать четвёртый", "Двадцать пятый", "Двадцать шестой", "Двадцать седьмой", "Двадцать восьмой",
                "Двадцать девятый", "Тридцатый"};

        //количество слов в списке
        int ListLength = wordList.length;
        System.out.println("Количество игроков " + ListLength);
        int i;

        //shuffleArray(String[] wordList[]);
        //shuffle(wordList);
        //shuffleArray(wordList);
        Collections.shuffle(wordList);
        //for (i: wordList);{

        for (i = 1; i <= ListLength; i++){

            // swap (wordList[i], wordList[RANDOM(i/ListLength - 1) ]);

            //строка Стол №1
            if (i == 1) {
                        System.out.println();
                        System.out.println("Стол №1");}

            //выводим фразу на экран
            System.out.println(wordList[i] + " игрок");

            //после десяти игроков строка Стол №2
            if (i == 10){
                        System.out.println();
                        System.out.println("Стол №2");}

            //после 20 игроков строка Стол3
            if (i == 20){
                        System.out.println();
                        System.out.println("Стол №3");}
        }
    }

    public static void shuffleArray(String[] a) {
        int n = a.length;
        Random random = new Random();
        random.nextInt();
        for (int i = 0; i < n; i++) {
            int change = i + random.nextInt(n - i);
            swap(a, i, change);
        }
    }

    private static void swap(int[] a, int i, int change) {
        int temp = a[i];
        a[i] = a[change];
        a[change] = temp;
    }
}
            */


import java.lang.String;
import java.util.ArrayList;

public class MafiaTurnir {
    public static void main (String[] args)
    {
        int i;
        ArrayList<String> PlayerList = new ArrayList<String>(20);

        // use add() method to add values in the list
            PlayerList.add("1й");
            PlayerList.add("2й");
            PlayerList.add("3й");
            PlayerList.add("4й");
            PlayerList.add("5й");
            PlayerList.add("6й");
            PlayerList.add("7й");
            PlayerList.add("8й");
            PlayerList.add("9й");
            PlayerList.add("10й");
            PlayerList.add("11й");
            PlayerList.add("12й");
            PlayerList.add("13й");
            PlayerList.add("14й");
            PlayerList.add("15й");
            PlayerList.add("16й");
            PlayerList.add("17й");
            PlayerList.add("18й");
            PlayerList.add("19й");
            PlayerList.add("20й");

    /*    {"Первый","Второй","Третий","Четвертый","Пятый","Шестой","Седьмой","Восьмой","Девятый","Десятый",
                "Одинадцатый","Двенадцатый","Тринадцатый","Четырнадцатый","Пятнадцатый","Шестнадцатый","Семнадцатый",
                "Восемнадцатый","Девятнадцатый","Двадцатый"};   */

        //количество слов в списке
        //int ListLength = PlayerList.length;
        //System.out.println("Количество игроков" + ListLength);
        //int i;

        for (i = 0; i < 20; i++)
        {
            //генерируем случайное число
            int rand = (int) (Math.random() * 20);

            //номер игрока из списка
            //String NPlayer = PlayerList<rand>;

            //строка Стол1
            if (i == 1) {System.out.println(); System.out.println("Стол №1");}

            //выводим фразу на экран
            System.out.println(PlayerList);

            //после десяти игроков строка Стол2
            if (i == 10) {System.out.println(); System.out.println("Стол №2");}

            PlayerList.remove("1й");
        }
    }
}









    /*

    // !!! Прога повторяет игроков !!!


    /*public static void main (String[] args)
    {
        String[] wordList= {"Первый","Второй","Третий","Четвертый","Пятый","Шестой","Седьмой","Восьмой","Девятый","Десятый",
                "Одинадцатый","Двенадцатый","Тринадцатый","Четырнадцатый","Пятнадцатый","Шестнадцатый","Семнадцатый",
                "Восемнадцатый","Девятнадцатый","Двадцатый"};

        //количество слов в списке
        int ListLength = wordList.length;
        System.out.println("Количество игроков" + ListLength);
        int i;

        for (i = 0; i < ListLength; i++)
        {
            //генерируем случайное число
            int rand1 = (int) (Math.random() * ListLength);

            //номер игрока из списка
            String NPlayer = wordList[rand1];

            //после десяти игроков строка Стол1
            if (i == 1) {System.out.println(); System.out.println("Стол №1");}

            //выводим фразу на экран
            System.out.println(NPlayer + " игрок");

            //после десяти игроков строка Стол2
            if (i == 10) {System.out.println(); System.out.println("Стол №2");}
        }
    }
}
                  */



