/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Objects;

/**
 *
 * @author user
 */
public class PhienBanSanPhamDTO {
    private int maPhienBanSp; //Ví dụ: Áo thun Nam trắng cotton - size L VN
    private int maSp;
    private int chatLieu;//viết int để kết với maChatLieu trong ChatLieuDTO.java
    private int gioiTinh; //viết int để kết với maGioiTinh trong GioiTinhDTO.java
    private int mauSac; //viết int để kết với maMau trong MauSacDTO.java
    private int size; //viết int để kết với maSize trong SizeQuanAoDTO.java
    private int thuongHieu;
    private int xuatXu;
    private int giaNhap;
    private int giaXuat;
    private int soLuongTon;
    public PhienBanSanPhamDTO() {
    }
    public PhienBanSanPhamDTO(int maPhienBanSp, int maSp, int chatLieu, int gioiTinh, int mauSac, int size, int thuongHieu, int xuatXu, int giaNhap, int giaXuat, int soLuongTon) {
        this.maPhienBanSp = maPhienBanSp;
        this.maSp = maSp;
        this.chatLieu = chatLieu;
        this.gioiTinh = gioiTinh;
        this.mauSac = mauSac;
        this.size = size;
        this.thuongHieu = thuongHieu;
        this.xuatXu = xuatXu;
        this.giaNhap = giaNhap;
        this.giaXuat = giaXuat;
        this.soLuongTon = soLuongTon;
    }
    public int getMaPhienBanSp() {
        return maPhienBanSp;
    }

    public void setMaPhienBanSp(int maPhienBanSp) {
        this.maPhienBanSp = maPhienBanSp;
    }

    public int getMaSp() {
        return maSp;
    }

    public void setMaSp(int maSp) {
        this.maSp = maSp;
    }

    public int getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(int chatLieu) {
        this.chatLieu = chatLieu;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getMauSac() {
        return mauSac;
    }

    public void setMauSac(int mauSac) {
        this.mauSac = mauSac;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(int thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public int getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(int xuatXu) {
        this.xuatXu = xuatXu;
    }

    public int getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(int giaNhap) {
        this.giaNhap = giaNhap;
    }

    public int getGiaXuat() {
        return giaXuat;
    }

    public void setGiaXuat(int giaXuat) {
        this.giaXuat = giaXuat;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PhienBanSanPhamDTO that = (PhienBanSanPhamDTO) obj;
        return maPhienBanSp == that.maPhienBanSp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maPhienBanSp);
    }
    @Override 
    public String toString() { 
        return "PhienBanSanPhamDTO{" + "maPhienBanSp=" + maPhienBanSp + ", maSp=" + maSp + ", chatLieu=" + chatLieu + ", gioiTinh=" + gioiTinh + ", mauSac=" + mauSac + ", size=" + size + ", thuongHieu=" + thuongHieu + ", xuatXu=" + xuatXu + ", giaNhap=" + giaNhap + ", giaXuat=" + giaXuat + ", soLuongTon=" + soLuongTon + '}'; 
    }
}
