package DTO.ThuocTinhSanPham;

import java.util.Objects;

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
    public int hashCode() {
        return Objects.hash(maSize);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SizeQuanAoDTO that = (SizeQuanAoDTO) obj;
        return maSize == that.maSize;
    }
    @Override
    public String toString() {
        return "SizeQuanAoDTO{maSize=" + maSize + ", tenSize='" + tenSize + "'}";
    }
}
