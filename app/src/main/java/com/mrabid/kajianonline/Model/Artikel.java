package com.mrabid.kajianonline.Model;

/**
 * Created by Mr Abid on 11/15/2017.
 */

public class Artikel {
    private String image;
    private String judul;
    private String isi;

    public Artikel(String image, String judul, String isi) {
        this.image = image;
        this.judul = judul;
        this.isi = isi;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }
}
