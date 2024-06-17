package kieu_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LopLinkedList {
    public static void main(String[] args) {
        List<String> ds_ten = new LinkedList<>();

        ds_ten.add("Binh");
        ds_ten.add("Tien");
        ds_ten.add("Nam");
        ds_ten.add("Ngoc");
        ds_ten.add("Binh");
        ds_ten.add("Nam");
        ds_ten.add("Lan");

        for(String ten: ds_ten){
            System.out.println(ten);
        }
    }
}
