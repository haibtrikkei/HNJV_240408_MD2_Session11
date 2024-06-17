package kieu_sorted_set;

import java.util.SortedSet;
import java.util.TreeSet;

public class LopTreeSet {
    public static void main(String[] args) {
        SortedSet<Integer> dsSo = new TreeSet<>();

        dsSo.add(20);
        dsSo.add(10);
        dsSo.add(15);
        dsSo.add(5);
        dsSo.add(20);
        dsSo.add(5);

        for(Integer so : dsSo){
            System.out.println(so);
        }
    }
}
