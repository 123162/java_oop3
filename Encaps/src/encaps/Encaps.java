package encaps;

public class Encaps {

    public static void main(String[] args) {
        // create two Point objects
        Point p1 = new Point(5, 2);
     

        System.out.println("p1: (" + p1.getX() + ", " + p1.getY() + ")");
       
        p1.translate(2, 4);
        System.out.println("p1': (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println(p1.distanceFromOrigin()); 
    
    }

}


