package com.baitapvenha_3;

public class Main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(1,"Nguyên Văn Linh",6.5,9);
        SinhVien sv2 = new SinhVien(2,"Nguyên Minh Chiến",7.6,8);
        SinhVien sv3 = new SinhVien(3,"Nguyen Văn C",8.7,7);

        System.out.println( sv1.toString());
        System.out.println( sv2.toString());
        System.out.println( sv3.toString());
    }
}
