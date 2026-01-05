/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO.ThuocTinhSanPham;

import java.util.Objects;

/**
 *
 * @author user
 */
public class ThuongHieuDTO {
    private int maThuongHieu;
    private String tenThuongHieu;

    public ThuongHieuDTO() {
    }

    public ThuongHieuDTO(int maThuongHieu, String tenThuongHieu) {
        this.maThuongHieu = maThuongHieu;
        this.tenThuongHieu = tenThuongHieu;
    }

    public int getMaThuongHieu() {
        return maThuongHieu;
    }

    public void setMaThuongHieu(int maThuongHieu) {
        this.maThuongHieu = maThuongHieu;
    }

    public String getTenThuongHieu() {
        return tenThuongHieu;
    }

    public void setTenThuongHieu(String tenThuongHieu) {
        this.tenThuongHieu = tenThuongHieu;
    }
    @Override
    public int hashCode() {
        return Objects.hash(maThuongHieu);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ThuongHieuDTO that = (ThuongHieuDTO) obj;
        return maThuongHieu == that.maThuongHieu;
    }
    @Override
    public String toString() {
        return "ThuongHieuDTO{" + "mathuonghieu=" + maThuongHieu + ", tenthuonghieu=" + tenThuongHieu + '}';
    }
}
