
package ınterface;


public class Interface {

  
    public static void main(String[] args) {
        PcMuhendisi muh=new PcMuhendisi(false,false);
        muh.askerlikDurumu();
        muh.adliSicil();
        muh.mezuniyetAgno(3.45);
        String[] tecrube={"arçelik","migros","uzay ve havacılık","sanayi bakanlığı"};
        muh.isTecrubesi(tecrube);
    }
    
}
