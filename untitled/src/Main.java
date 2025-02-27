
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world");
        Point p = new Point();
        p.x = 5.0;
        p.y = 3.0;
        System.out.println("(" + p.x + ", " + ")");
        System.out.println("P: " + p);

//        p.translate(dx 5, dy +5);
//        System.out.println("translate: "+p);
//
//        System.out.println("translated: ", "+p.translated);

        Segment seg = new Segment();
        seg.a = new Point();
        seg.b = new Point();
        seg.a.x = 1.0;
        seg.a.y = 1.0;
        seg.b.y = 4;
        seg.b.y = 4;

        Segment[] tab = new Segment[2];
        tab[0] = seg;

        tab[1] = new Segment();
        tab[1].a = new Point();
        tab[1].b = new Point();
        tab[1].a.x = 0;
        tab[1].a.y = 0;
        tab[1].b.x = 12;
        tab[1].b.y = 5;
        Segment longest = Segment(tab);
        System.out.println("longest" +longest.length());

    }
}






