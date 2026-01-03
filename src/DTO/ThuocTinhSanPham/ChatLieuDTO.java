package DTO.ThuocTinhSanPham;

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
    public String toString() {
        return "ChatLieuDTO{maChatLieu=" + maChatLieu + ", tenChatLieu='" + tenChatLieu + "'}";
    }
}
