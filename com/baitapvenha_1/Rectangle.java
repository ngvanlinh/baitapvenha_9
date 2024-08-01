package com.baitapvenha_1;

public class Rectangle {
    private int chieuDai;
    private int chieuRong;
    private int DienTich ;
    private int ChuVi;

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }

    public Rectangle() {
    }

    public Rectangle(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public int DienTichHCN(int chieuDai, int chieuRong){
        DienTich = chieuDai * chieuRong;
        
        return DienTich;
    }
    public int ChuViHCN(int chieuDai, int chieuRong){
         ChuVi = (chieuDai + chieuRong) * 2;
        return ChuVi;
    }
}
