package com_2.baitapvenha_4;

import java.util.HashSet;

public class main {

    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        Student student1 = new Student(1,"nguyen van A","Java32");
        Student student6 = new Student(2,"nguyen van A","Java32");
        Student student2 = new Student(3,"nguyen van b","Java33");
        Student student3 = new Student(4,"nguyen van c","Java34");
        Student student4 = new Student(5,"nguyen van d","Java35");
        Student student5 = new Student(1,"nguyen van e","Java36");


        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student4);
        set.add(student5);
        set.add(student6);

        for (Student element: set) {
            System.out.println(element);
        }

    }
    // số lượng bằng 6
    // kết quả trùng lặp vẫn được thêm vào hashset
}
