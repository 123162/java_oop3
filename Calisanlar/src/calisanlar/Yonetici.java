
package calisanlar;

public class Yonetici extends Calisan{
    private int sorumluKisiSayisi;

    public Yonetici(String ad, String soyad, int ID,int sorumluKisiSayisi) {
        super(ad, soyad, ID);
        this.sorumluKisiSayisi=sorumluKisiSayisi;
        
    }

    @Override
    public String toString() {
        return super.toString()+"sorumlu olduğu kişi sayisi: "+sorumluKisiSayisi; 
    
    }
      public void zamYap(int zamMiktarı){
        System.out.println(getAd()+"çalışanlara "+zamMiktarı+" zam yaptı");
    }
    
}
