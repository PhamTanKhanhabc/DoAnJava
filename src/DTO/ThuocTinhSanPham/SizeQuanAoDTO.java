package DTO.ThuocTinhSanPham;

public class SizeQuanAoDTO {

    private int maSize;
    private String tenSize;

    public SizeQuanAoDTO() {
    }

    public SizeQuanAoDTO(int maSize, String tenSize) {
        this.maSize = maSize;
        this.tenSize = tenSize;
    }

    public int getMaSize() {
        return maSize;
    }

    public void setMaSize(int maSize) {
        this.maSize = maSize;
    }

    public String getTenSize() {
        return tenSize;
    }

    public void setTenSize(String tenSize) {
        this.tenSize = tenSize;
    }

    @Override
    public String toString() {
        return "SizeQuanAoDTO{maSize=" + maSize + ", tenSize='" + tenSize + "'}";
    }
}
