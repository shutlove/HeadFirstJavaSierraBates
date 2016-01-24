
/**  * Created by nac999 on 04.02.2015.  * */
public class DogBark66 {
        int size;
        String breed;
        String name;

        void bark() {
            System.out.println("Гав! Гав!");
        }
    }

class DogTestDrive {
    public static void main(String[] args) {
        DogBark66 d = new DogBark66();
        d.size = 40;
        d.bark();
    }
}
