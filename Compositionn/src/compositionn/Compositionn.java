
package compositionn;


public class Compositionn {

    public static void main(String[] args) {
       Resolution resolution=new Resolution(1920,1222);
       Monitor monitor=new Monitor("VS23","ASUS","12.3",resolution);
       Kasa kasa=new Kasa("sdadow","shg","win10");
       Anakart anakart=new Anakart("b23","asus",10,"ubuntu");
       Bilgisayar pc=new Bilgisayar(monitor,kasa,anakart);
       pc.getAnakart().isletimSistemiYukle("ubuntu 18.3");
       pc.getKasa().bilgisayariAc();
       pc.getMonitor().monitoruKapat();
    }
    
}
