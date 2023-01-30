package getsetalıstırma;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dataBaseManager {
    // İşlem Tarihi Almak İçin Calendar Sınıf tanımlaması:

    LocalDate localDate = LocalDate.now();
    // Private Eleman Tanımlamaları:
    private String dbName = "root", dbPass = "root123";
    private String userName;

    protected void dbLog() {
        System.out.println("Oturum Başarılı Şekilde Açıldı.\nİşlemi Gerçekleştiren: " + userName);
        System.out.println("İşlem Tarihi: " + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(localDate));
    }

    // Private Elemanlarda Verilere Erişim:
    public String getDbName() {
        return dbName;
    }

    public String getDbPass() {
        return dbPass;
    }

    // Private Elemanlardaki Verileri Değiştirme:
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
