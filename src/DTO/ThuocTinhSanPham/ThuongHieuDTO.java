/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO.ThuocTinhSanPham;

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
    public String toString() {
        return "ThuongHieuDTO{" + "mathuonghieu=" + maThuongHieu + ", tenthuonghieu=" + tenThuongHieu + '}';
    }
}
