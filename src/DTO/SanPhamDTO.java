/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Objects;

/**
 *
 * @author Phạm Tấn Khánh
 */
public class SanPhamDTO {
    private int maSp; //vd 123: áo thun
    private String tenSp;
    private String hinhAnh;
    private int thoiGianBaoHanh;
    private int thuongHieu; //viết int để kết với maThuongHieu trong ThuongHieuDTO.java
    private int khuVucKho;//viết int để kết với maKhuVuc trong KhuVucKhoDTO.java
    private int soLuongTon;
    public SanPhamDTO() {
    }
    public SanPhamDTO(int maSp, String tenSp, String hinhAnh, int thuongHieu, int thoiGianBaoHanh) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.hinhAnh = hinhAnh;
        this.thuongHieu = thuongHieu;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
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
    public int hashCode() {
        return Objects.hash(maSp);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SanPhamDTO that = (SanPhamDTO) obj;
        return maSp == that.maSp;
    }

    @Override 
    public String toString() { 
        return "SanPhamDTO{" + "maSp=" + maSp + ", tenSp='" + tenSp + '\'' + ", hinhAnh='" + hinhAnh + '\'' + ", thuongHieu=" + thuongHieu + ", thoiGianBaoHanh=" + thoiGianBaoHanh + '}'; 
    }
}
