/**  * * Created by nac999 on 19.01.2015.  * */

/*public*/ class BierBottles
{
    public static void main (String[] args)
    {
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0)
        {
            if (beerNum == 1)
            {
                word = "bottle"; // В единственном числе - ОДНА бутылка
            }

            System.out.println(beerNum + " " + word + " of beer on the wall. " + beerNum + " " + word +" of beer. Take one down. Pass it around.");
            beerNum = beerNum - 1;
        }
        System.out.println("No more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more.");
    }
}
