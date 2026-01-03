/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author user
 */
public class ChiTietSanPhamDTO {
    private int maLo; // ví dụ Lô 1: mã 123 Áo thun Nam trắng cotton - size L VN 10 cái, Lô 2: mã 321 Quần jean nuwx xanh - size XL TQ 30 cái. 
    private int maPhienBanSp;
    private int maPhieuNhap;
    private int maPhieuXuat;
    private int tinhTrang;
    public ChiTietSanPhamDTO() {
    }
    public ChiTietSanPhamDTO(int maLo, int maPhienBanSp, int maPhieuNhap, int maPhieuXuat, int tinhTrang) {
        this.maLo = maLo;
        this.maPhienBanSp = maPhienBanSp;
        this.maPhieuNhap = maPhieuNhap;
        this.maPhieuXuat = maPhieuXuat;
        this.tinhTrang = tinhTrang;
    }
    public int getMaLo() {
        return maLo;
    }

    public void setMaLo(int maLo) {
        this.maLo = maLo;
    }

    public int getMaPhienBanSp() {
        return maPhienBanSp;
    }

    public void setMaPhienBanSp(int maPhienBanSp) {
        this.maPhienBanSp = maPhienBanSp;
    }

    public int getMaPhieuNhap() {
        return maPhieuNhap;
    }

    public void setMaPhieuNhap(int maPhieuNhap) {
        this.maPhieuNhap = maPhieuNhap;
    }

    public int getMaPhieuXuat() {
        return maPhieuXuat;
    }

    public void setMaPhieuXuat(int maPhieuXuat) {
        this.maPhieuXuat = maPhieuXuat;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    @Override 
    public String toString() { 
        return "ChiTietSanPhamDTO{" + "maLo=" + maLo + ", maPhienBanSp=" + maPhienBanSp + ", maPhieuNhap=" + maPhieuNhap + ", maPhieuXuat=" + maPhieuXuat + ", tinhTrang=" + tinhTrang + '}'; 
    }
}
