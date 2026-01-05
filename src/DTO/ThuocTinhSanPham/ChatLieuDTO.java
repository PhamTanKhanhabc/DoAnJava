package DTO.ThuocTinhSanPham;

import java.util.Objects;

public class ChatLieuDTO {

    private int maChatLieu;
    private String tenChatLieu;

    public ChatLieuDTO() {
    }

    public ChatLieuDTO(int maChatLieu, String tenChatLieu) {
        this.maChatLieu = maChatLieu;
        this.tenChatLieu = tenChatLieu;
    }

    public int getMaChatLieu() {
        return maChatLieu;
    }

    public void setMaChatLieu(int maChatLieu) {
        this.maChatLieu = maChatLieu;
    }

    public String getTenChatLieu() {
        return tenChatLieu;
    }

    public void setTenChatLieu(String tenChatLieu) {
        this.tenChatLieu = tenChatLieu;
    }
    @Override
    public int hashCode() {
        return Objects.hash(maChatLieu);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ChatLieuDTO that = (ChatLieuDTO) obj;
        return maChatLieu == that.maChatLieu;
    }

    @Override
    public String toString() {
        return "ChatLieuDTO{maChatLieu=" + maChatLieu + ", tenChatLieu='" + tenChatLieu + "'}";
    }
}
