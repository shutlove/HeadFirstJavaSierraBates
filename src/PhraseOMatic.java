/** Created by stan-djan on 21.01.2015. */
public class PhraseOMatic
{
    public static void main (String[] args)
    {
        //три набора слов
        String[] wordListOne = {"круглосуточный", "трех-звенный", "30000-футовый", "взаимный", "обоюдный выигрыш",
                                "фронтэнд", "на основе вэб-технологий", "проникающий", "умный", "шесть сигм",
                                "метод критического пути", "динамичный"};

        String[] wordListTwo = {"уполномоченный", "трудный", "чистый продукт", "ориентированный", "центральный",
                                "распределенный", "кластеризованный", "фирменный", "нестандартный ум", "позиционированный",
                                "сетевой", "сфокусированный", "использованный с выгодой", "выровненный", "нацеленный на",
                                "общий", "совместный", "ускоренный"};

        String[] wordListThree = {"процесс", "пункт разгрузки", "выход из положения", "тип структуры", "талант", "подход",
                                "уровень завоеванного внимания", "портал", "портал времени", "обзор", "образец",
                                "пункт следования"};

        //количество слов в каждом списке
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //генерируем три случайных числа
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        //строим фразу
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        //выводим фразу на экран
        System.out.println("Всё, что нам нужно - это " + phrase);
    }
}
