
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world");
        Point p = new Point();
        p.x = 5.0;
        p.y = 3.0;
        System.out.println("("+p.x+", "+")");
        System.out.println("P: "+p);

        p.translate(dx 5, dy +5);
        System.out.println("translate: "+p);

        System.out.println("translated: ", "+p.translated);
    }
}

