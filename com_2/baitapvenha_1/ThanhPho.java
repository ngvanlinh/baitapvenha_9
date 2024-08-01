package com_2.baitapvenha_1;

import java.util.ArrayList;
import java.util.List;

public class ThanhPho {
    public static void main(String[] args) {
        List<String> listCity = new ArrayList<>();
        listCity.add("Hà Nội");
        listCity.add("Hà Nam");
        listCity.add("Hòa Bình");
        for (int i = 0; i < listCity.size(); i++) {
            System.out.println(listCity.get(i));
        }
        System.out.println(listCity);
    }
}
