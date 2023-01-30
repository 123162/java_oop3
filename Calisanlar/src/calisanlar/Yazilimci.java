
package calisanlar;

public class Yazilimci extends Calisan{
    private String diller;
    
    public Yazilimci(String ad, String soyad, int ID,String diller) {
        super(ad, soyad, ID);
        this.diller=diller;
    }
    public void formatAt(String isletimSistemi){
        System.out.println(getAd()+""+isletimSistemi +"ni yüklüyor...");
    }
    @Override
    public String toString(){
        return super.toString()+"diller: "+diller;
    }
}
