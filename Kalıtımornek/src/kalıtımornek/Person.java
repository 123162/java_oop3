
package kalıtımornek;

public class Person {
    private String name;
    private String adres;

    public Person(String name, String adres) {
        this.name = name;
        this.adres = adres;
    }

    public String getName() {
        return name;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
    @Override
    public String toString(){
        return "name : "+name +"adres:"+adres;
    }
}
