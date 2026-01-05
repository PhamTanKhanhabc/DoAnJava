package DTO.ThuocTinhSanPham;

import java.util.Objects;

public class MauSacDTO {

    private int maMau;
    private String tenMau;

    public MauSacDTO() {
    }

    public MauSacDTO(int maMau, String tenMau) {
        this.maMau = maMau;
        this.tenMau = tenMau;
    }

    public int getMaMau() {
        return maMau;
    }

    public void setMaMau(int maMau) {
        this.maMau = maMau;
    }

    public String getTenMau() {
        return tenMau;
    }

    public void setTenMau(String tenMau) {
        this.tenMau = tenMau;
    }
    @Override
    public int hashCode() {
        return Objects.hash(maMau);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MauSacDTO that = (MauSacDTO) obj;
        return maMau == that.maMau;
    }
    @Override
    public String toString() {
        return "MauSacDTO{maMau=" + maMau + ", tenMau='" + tenMau + "'}";
    }
}
