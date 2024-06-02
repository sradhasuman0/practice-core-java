import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ArrayWithComparator {

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(5);
        l.add(3);
        l.add(10);
        l.add(60);
        l.add(45);
        l.add(34);
        Collections.sort(l);
        System.out.println("old" +l);
        Collections.sort(l,(I1,I2)->(I1<I2)?+1:(I1>I2)?-1:0);
        System.out.println("new Comparartor" +l);
    }
}
