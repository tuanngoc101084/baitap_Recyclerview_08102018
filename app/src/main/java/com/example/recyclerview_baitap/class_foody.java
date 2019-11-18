package com.example.recyclerview_baitap;

public class class_foody {
    private int image_hinh_anh;
    private String txt_ten;
    private String txt_mota;

    public String getTxt_khuyenmai() {
        return txt_khuyenmai;
    }

    private String txt_khuyenmai;

    public class_foody() {
    }

    public int getImage_hinh_anh() {
        return image_hinh_anh;
    }

    public String getTxt_ten() {
        return txt_ten;
    }

    public String getTxt_mota() {
        return txt_mota;
    }

    public class_foody(int image_hinh_anh, String txt_ten, String txt_mota, String txt_khuyenmai) {
        this.image_hinh_anh = image_hinh_anh;
        this.txt_ten = txt_ten;
        this.txt_mota = txt_mota;
        this.txt_khuyenmai = txt_khuyenmai;
    }

}
