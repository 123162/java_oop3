
package calisanlar;

import java.util.Scanner;


public class Calisanlar {

    public static void main(String[] args) {
        //Yazilimci muh=new Yazilimci("rabia ","şenlik",9,"java");
        //System.out.println(muh.toString());
        //Yonetici muh2=new Yonetici("Rabia ","karakuş",9,2);
        //System.out.println(muh2.toString());
        
        Scanner sn=new Scanner(System.in);
       
        System.out.println("çalışanlar programına hoşgeldiniz..");
        String islemler="1-yazilimci işlemleri\n"
                        +"2-yönetici işlermleri\n"
                        +"Çıkış için q'ya basın";
        System.out.println("**************");
        System.out.println(islemler);
        System.out.println("*****************");
        while(true){
            System.out.println("işlemi seçiniz:");
            String islem=sn.nextLine();
            
            if(islem.equals("q")){
                System.out.println("sistemden çıkılıyor..");
                break;
            } else if (islem.equals("1")){
                Yazilimci muh = new Yazilimci("Mustafa Murat","Coşkun", 567,"Python,C,Java");
                String yazilimci_islem = "1. Format At\n"
                                         +"2. Bilgileri Göster\n"
                                         + "Çıkış için q'ya basın";
                System.out.println(yazilimci_islem);
                
                while (true) {
                    System.out.print("İşlemi Seçiniz : ");
                    String y_islem = sn.nextLine();
                    
                    if (y_islem.equals("q")) {
                        System.out.println("Yazılımcı İşlemlerinden Çıkılıyor...");
                        break;
                    }
                    else if (y_islem.equals("1")){
                        
                        System.out.print("İşletim Sistemi : ");
                        String isletim_sistemi = sn.nextLine();
                        muh.formatAt(isletim_sistemi);
                        
          }
                    else if (y_islem.equals("2")){
                        
                      System.out.println(muh.toString());
                    }
                    else {
                        System.out.println("Geçersiz Yazılımcı İşlemi...");
                    }
                    
                }
                
                
                
            }else if(islem.equals("2")){
                Yonetici muh2=new Yonetici("Rabia ","karakuş",9,2);
                
                String yonetici_islem = "Yönetici İşlemleri\n"
                                        + "1. Zam Yap\n"
                                        + "2. Bilgileri Göster\n"
                                        + "Çıkış için q'ya basın";
                System.out.println(yonetici_islem);
                
                while (true) {
                    System.out.println("İşlemi Seçiniz: ");
                    String y_islem = sn.nextLine();
                    
                    if (y_islem.equals("q")){
                        System.out.println("Yönetici İşlemlerinden Çıkılıyor...");
                        break;
                        
                    }
                    else if (y_islem.equals("1")) {
                        System.out.print("Yöneticinin ne kadar zam yapmasını istiyorsunuz : ");
                        int zamMiktari = sn.nextInt();
                        sn.nextLine();
                        muh2.zamYap(zamMiktari);
                        
                    }
                    else if (y_islem.equals("2")){
                        System.out.println(muh2.toString());
                        
                    }
                    else {
                        System.out.println("Geçersiz Yönetici İşlemi....");
                    }
                    
                    
                }
                
           
            }else{
                System.out.println("geçersiz işlem");
            }
        }
    }
  
}
