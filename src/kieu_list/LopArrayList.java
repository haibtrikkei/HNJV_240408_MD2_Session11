package kieu_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LopArrayList {
    public static void main(String[] args) {
        List<Integer> dsSo = new ArrayList<>();
        dsSo.add(10);
        dsSo.add(20);
        dsSo.add(10);
        dsSo.add(20);
        dsSo.add(20);
        dsSo.add(20);
        dsSo.add(20);
        dsSo.add(20);

        //In ra theo cach 1:
        for(Integer so: dsSo){
            System.out.print(so+"\t");
        }

        System.out.println();

        //In ra theo cach 2:
        final Iterator<Integer> it = dsSo.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+"\t");
        }
        System.out.println();

        //In ra theo cach 3:
        for(int i=0;i<dsSo.size();i++){
            System.out.print(dsSo.get(i)+"\t");
        }
        System.out.println();

    }
}
