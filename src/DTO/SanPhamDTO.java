/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Phạm Tấn Khánh
 */
public class SanPhamDTO {
    private int maSp; //vd 123: áo thun
    private String tenSp;
    private String hinhAnh;
    private int xuatXu;//viết int để kết với maXuatXu trong XuatXu.java
    private int chatLieu;//viết int để kết với maChatLieuj trong ChatLieuDTO.java
    private int gioiTinh;//viết int để kết với maGioiTinh trong GioiTinhDTO.java
    private int mauSac;//viết int để kết với maMauSac trong MauSacDTO.java
    private int size;//viết int để kết với maSize trong SizeQuanAoDTO.java
    private int thoigianbaohanh;
    private int thuongHieu; //viết int để kết với maThuongHieu trong ThuongHieuDTO.java
    private int khuVucKho;//viết int để kết với maKhuVuc trong KhuVucKhoDTO.java
    private int soLuongTon;
    public SanPhamDTO() {
    }
    public SanPhamDTO(int maSp, String tenSp, String hinhAnh, int xuatXu, int chatLieu, int gioiTinh, int mauSac, int size, int thoigianbaohanh, int thuongHieu, int khuVucKho, int soLuongTon) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.hinhAnh = hinhAnh;
        this.xuatXu = xuatXu;
        this.chatLieu = chatLieu;
        this.gioiTinh = gioiTinh;
        this.mauSac = mauSac;
        this.size = size;
        this.thoigianbaohanh = thoigianbaohanh;
        this.thuongHieu = thuongHieu;
        this.khuVucKho = khuVucKho;
        this.soLuongTon = soLuongTon;
    }
    public int getMaSp() {
        return maSp;
    }

    public void setMaSp(int maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public int getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(int xuatXu) {
        this.xuatXu = xuatXu;
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

    public int getThoigianbaohanh() {
        return thoigianbaohanh;
    }

    public void setThoigianbaohanh(int thoigianbaohanh) {
        this.thoigianbaohanh = thoigianbaohanh;
    }

    public int getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(int thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public int getKhuVucKho() {
        return khuVucKho;
    }

    public void setKhuVucKho(int khuVucKho) {
        this.khuVucKho = khuVucKho;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }
    @Override 
    public String toString() { 
        return "SanPhamDTO{" + "maSp=" + maSp + ", tenSp='" + tenSp + '\'' + ", hinhAnh='" + hinhAnh + '\'' + ", xuatXu=" + xuatXu + ", chatLieu=" + chatLieu + ", gioiTinh=" + gioiTinh + ", mauSac=" + mauSac + ", size=" + size + ", thoigianbaohanh=" + thoigianbaohanh + ", thuongHieu=" + thuongHieu + ", khuVucKho=" + khuVucKho + ", soLuongTon=" + soLuongTon + '}'; 
    }
}
