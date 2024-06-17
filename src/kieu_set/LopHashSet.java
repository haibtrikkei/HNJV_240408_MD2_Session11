package kieu_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LopHashSet {
    public static void main(String[] args) {
        Set<Integer> dsSo = new HashSet<>();
        dsSo.add(10);
        dsSo.add(20);
        dsSo.add(10);
        dsSo.add(20);
        dsSo.add(20);
        dsSo.add(20);
        dsSo.add(20);
        dsSo.add(20);

        //In ra theo cach 1:
        for(Integer a: dsSo){
            System.out.print(a+"\t");
        }
        System.out.println();

        //In ra theo cach 2:
        final Iterator<Integer> it = dsSo.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+"\t");
        }
        System.out.println();

    }
}
