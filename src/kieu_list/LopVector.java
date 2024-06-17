package kieu_list;

import java.util.List;
import java.util.Vector;

public class LopVector {
    public static void main(String[] args) {
        List<Long> ds = new Vector<>();
        ds.add(10L);
        ds.add(20L);
        ds.add(30L);
        ds.add(10L);
        ds.add(20L);
        ds.add(5L);

        for(Long data : ds){
            System.out.println(data);
        }
    }
}
