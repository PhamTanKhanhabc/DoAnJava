package DTO.ThuocTinhSanPham;

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
    public String toString() { 
        return "XuatXuDTO{" + "maXuatXu=" + maXuatXu + ", tenXuatXu='" + tenXuatXu + '\'' + '}';
    }
}
