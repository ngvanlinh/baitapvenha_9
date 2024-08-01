package com.baitapvenha_3;

public class SinhVien {
    private int maSV;
    private String name;
    private double diemLiThuyet;
    private double diemThucHanh;

    private double DiemTrungBinh;

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiemLiThuyet() {
        return diemLiThuyet;
    }

    public void setDiemLiThuyet(double diemLiThuyet) {
        this.diemLiThuyet = diemLiThuyet;
    }

    public double getDiemThucHanh() {
        return diemThucHanh;
    }

    public void setDiemThucHanh(double diemThucHanh) {
        this.diemThucHanh = diemThucHanh;
    }

    public SinhVien() {
    }

    public SinhVien(int maSV, String name, double diemLiThuyet, double diemThucHanh) {
        this.maSV = maSV;
        this.name = name;
        this.diemLiThuyet = diemLiThuyet;
        this.diemThucHanh = diemThucHanh;
    }
    public double diemTrungBinh(double diemLiThuyet, double diemThucHanh){
        DiemTrungBinh = (diemLiThuyet + diemThucHanh)/2;
        return DiemTrungBinh;
    }

    @Override
    public String toString() {
        return
                "maSV= " + maSV +
                ", name= '" + name + '\'' +
                ", diemLiThuyet= " + diemLiThuyet +
                ", diemThucHanh= " + diemThucHanh +
                ", DiemTrungBinh= " + DiemTrungBinh
                ;
    }
}
