public class Point {
    public double x;
    public double y;

//    public string toString() {
//        return "(" ("+p.x+","+)")";
//
//    }
//    public string tosvg(){
//        return   <circle r=\"5"\" cx="x" cy="50" fill="red";
//    }
    public void translate(double dx, double dy){
        x += dx;
        this.y += dy;
    }
    public Point translated(double dx, double dy) {
        Point newPoint = new Point();
        newPoint.x = x + dx;
        newPoint.y = this.y + dy;
        return newPoint;
    }
}