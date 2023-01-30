
package ınterface;

public class PcMuhendisi implements IMuhendis{
    private boolean askerlik;
    private boolean adliSicil;

    public PcMuhendisi(boolean askerlik, boolean adliSicil) {
        this.askerlik = askerlik;
        this.adliSicil = adliSicil;
    }

    @Override
    public void askerlikDurumu() {
        if(askerlik){
            System.out.println("askerliğimi yaptım");
        }else{
            System.out.println("askerliğimi yapmadım");
        }
    }

    @Override
    public String mezuniyetAgno(double derece) {
        return "agnom : "+ derece;
    }

    @Override
    public void adliSicil() {
        if(adliSicil){
            System.out.println("adli sicil kaydı var");
        }else{
        System.out.println("adli sicil kaydım yok");
    }
    }

    @Override
    public void isTecrubesi(String[] array) {
        System.out.println("şu şirketlerde çalıştım..");
        
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    
}
