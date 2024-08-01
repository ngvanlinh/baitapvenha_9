package com_2.baitapvenha_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BaiTap_2 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(5);
        arr.add(2);
        arr.add(3);
        arr.add(2);
        System.out.println("danh sách ban đầu:");
        System.out.println(arr);
        HashSet hs = new HashSet();
        hs.addAll(arr);
        System.out.println("danh sách hashSet:");
        System.out.println(hs);
    }
}
