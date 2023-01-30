
package kalıtımornek;

public class Student extends Person{
   private int dersSayisi;
   private String[] dersler;
   private int not[];
   private static final int MAX_DERS=30;

    public Student(String name, String adres) {
        super(name, adres);
        dersSayisi=0;
        dersler=new String[MAX_DERS];
        not=new int[MAX_DERS];
        
   }
    public void dersNotuEkle(String course,int grade){
        dersler[dersSayisi]=course;
        not[dersSayisi]=grade;
        dersSayisi++;
        
        
    }
    public void notlariYazdir(){
        for(int i=0;i<dersSayisi;i++){
            System.out.println(dersler[i]+":"+ not[i]);
        }
        System.out.println();
    }
    public double ortalama(){
        int sum=0;
        for(int i=0;i<dersler.length;i++){
            sum+=not[i];
        }
        return (double)sum/dersSayisi;
    }
   @Override
    public String toString(){
        return super.toString();
    }
}
