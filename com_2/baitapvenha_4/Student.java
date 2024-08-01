package com_2.baitapvenha_4;

public class Student {
    private int id;
    private String name;
    private String clazz;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public Student() {
    }

    public Student(int id, String name, String clazz) {
        this.id = id;
        this.name = name;
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", name='" + name + '\'' +
                ", clazz='" + clazz + '\''
                ;
    }
}
