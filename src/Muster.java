import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**  * Created by nac999 on 22.01.2015.  */

public class Muster {
    public static void main(String[] args) {
        Integer[] ints = new Integer[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i;
        }
        List<Integer> lst = Arrays.asList(ints);
        Collections.shuffle(lst);                        //!!!!!

        ints = lst.toArray(ints);
        for (Integer i : ints) {
            System.out.print(ints [i] + " ");
        }
    }
}
