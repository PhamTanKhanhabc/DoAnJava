package DTO.ThuocTinhSanPham;

import java.util.Objects;

public class XuatXuDTO {

    private int maXuatXu;
    private String tenXuatXu;

    public XuatXuDTO() {
    }

    public XuatXuDTO(int maXuatXu, String tenXuatXu) {
        this.maXuatXu = maXuatXu;
        this.tenXuatXu = tenXuatXu;
    }

    public int getMaXuatXu() {
        return maXuatXu;
    }

    public void setMaXuatXu(int maXuatXu) {
        this.maXuatXu = maXuatXu;
    }

    public String getTenXuatXu() {
        return tenXuatXu;
    }

    public void setTenXuatXu(String tenXuatXu) {
        this.tenXuatXu = tenXuatXu;
    }
    @Override
    public int hashCode() {
        return Objects.hash(maXuatXu);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        XuatXuDTO that = (XuatXuDTO) obj;
        return maXuatXu == that.maXuatXu;
    }
    @Override 
    public String toString() { 
        return "XuatXuDTO{" + "maXuatXu=" + maXuatXu + ", tenXuatXu='" + tenXuatXu + '\'' + '}';
    }
}
