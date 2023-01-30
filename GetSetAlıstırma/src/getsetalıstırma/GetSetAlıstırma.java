package getsetalıstırma;

import java.util.Scanner;

public class GetSetAlıstırma {

    public static void main(String[] args) {
        // Ekrana Yazdırma Sınıfını Tanımlama:
        Scanner scanner = new Scanner(System.in);
        // dataBaseManager Sınıfının Tanımlanması:
        dataBaseManager db = new dataBaseManager();
        // Değişken Tanımlaması:
        String kullaniciAdi, dbName, dbPass;
        // Ekrana Yazdırma İşlemleri:
        System.out.print("Merhaba!\nLütfen Kullanıcı Adını Girin: ");
        kullaniciAdi = scanner.nextLine();
        System.out.print("Database İsmini Girin: ");
        dbName = scanner.nextLine();
        System.out.print("Database Şifresini Girin: ");
        dbPass = scanner.nextLine();
        if (db.getDbName().equals(dbName) && db.getDbPass().equals(dbPass)) {
            db.setUserName(kullaniciAdi);
            db.dbLog();
        } else {
            System.out.print("Hatalı Giriş Gerçekleştirdiniz.");
        }
    }
}

