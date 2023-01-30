package kalıtımornek;

public class Kalıtımornek {

    public static void main(String[] args) {
        Student s1 = new Student("Tan Ah Teck", "1 Happy Ave");
        System.out.println(s1);
        s1.dersNotuEkle("IM101", 97);
        s1.notlariYazdir();

        System.out.println("ortalama " + s1.ortalama());

        Person t1 = new Person("Paul Tan", "8 sunset way");
        System.out.println(t1);

    }
}
