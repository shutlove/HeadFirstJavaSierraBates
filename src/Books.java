/**  * Created by nac999 on 12.02.2015.  */
public class Books {

    String title;
    String author;
}

class BooksTestDrive93 {
    public static void main(String[] args) {  //Exception???
        Books[] myBooks = new Books[3];
        int x = 0;

        myBooks[1].title = "Плоды java";
        myBooks[2].title = "Java Гэтсби";
        myBooks[3].title = "Сборник рецептов по java";

        myBooks[1].author = "Боб";
        myBooks[2].author = "Сью";
        myBooks[3].author = "Ян";

        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(", автор");
            System.out.print(myBooks[x].author);
        }
    }
}


