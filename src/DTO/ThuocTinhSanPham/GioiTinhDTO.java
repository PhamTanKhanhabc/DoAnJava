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
public class GioiTinhDTO {

    private int maGioiTinh;
    private String tenGioiTinh;

    public GioiTinhDTO() {
    }

    public GioiTinhDTO(int maGioiTinh, String tenGioiTinh) {
        this.maGioiTinh = maGioiTinh;
        this.tenGioiTinh = tenGioiTinh;
    }

    public int getMaGioiTinh() {
        return maGioiTinh;
    }

    public void setMaGioiTinh(int maGioiTinh) {
        this.maGioiTinh = maGioiTinh;
    }

    public String getTenGioiTinh() {
        return tenGioiTinh;
    }

    public void setTenGioiTinh(String tenGioiTinh) {
        this.tenGioiTinh = tenGioiTinh;
    }
    @Override
    public int hashCode() {
        return Objects.hash(maGioiTinh);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        GioiTinhDTO that = (GioiTinhDTO) obj;
        return maGioiTinh == that.maGioiTinh;
    }
    @Override
    public String toString() {
        return "GioiTinhDTO{maGioiTinh=" + maGioiTinh + ", tenGioiTinh='" + tenGioiTinh + "'}";
    }
}

