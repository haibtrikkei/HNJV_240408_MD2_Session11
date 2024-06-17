package kieu_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LopLinkHashSet {
    public static void main(String[] args) {
        Set<String> ds_ten = new LinkedHashSet<>();
        ds_ten.add("Cuong");
        ds_ten.add("Ngoc");
        ds_ten.add("Cuong");
        ds_ten.add("Ngoc");
        ds_ten.add("Cuong");

        for(String ten: ds_ten){
            System.out.println(ten);
        }
    }
}
