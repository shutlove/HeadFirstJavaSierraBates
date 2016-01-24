/**  * Created by nac999 on 12.02.2015. */
class Movie {
    String title;
    String genre;
    int rating;

    void playIt() {              // не запускается?
        System.out.println("Проигрывание фильма");
    }
}

public class MovieTestDrive67{
    public static void main (String[] args) {
        Movie one = new Movie();
        one.title = "Как прогореть на акциях";
        one.genre = "Трагедия";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "Как прогореть на акциях";
        two.genre = "Трагедия";
        two.rating = -2;
        Movie three = new Movie();
        three.title = "Байт-Клуб";
        three.genre = "Трагедия, но в целом веселая";
        three.rating = 127;
    }
}
