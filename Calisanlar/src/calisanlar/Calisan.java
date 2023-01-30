
package calisanlar;

public class Calisan {
    private String ad;
    private String soyad;
    private int ID;

    public Calisan(String ad, String soyad, int ID) {
        this.ad = ad;
        this.soyad = soyad;
        this.ID = ID;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    @Override
    public String toString(){
        return("ad:"+ ad+ "soyad :"+ soyad+" ıd: "+ID);
    }
}
