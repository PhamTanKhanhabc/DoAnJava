/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author user
 */
import DTO.SanPhamDTO;
import DTO.ThuocTinhSanPham.ThuongHieuDTO;

public class TestDTO {
    public static void main(String[] args) {
        SanPhamDTO sp = new SanPhamDTO();
        sp.setMaSp(1);
        sp.setTenSp("Áo thun");
        sp.setHinhAnh("ao.png");
        sp.setXuatXu(100);
        System.out.println(sp);
        
        ThuongHieuDTO th = new ThuongHieuDTO(5, "Nike");
        System.out.println(th);
    }
}

