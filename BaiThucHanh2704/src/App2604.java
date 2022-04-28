import Shape.Point;
import Shape.Quadrilateral;
import Shape.Triangle;
public class App2604 {
    public static void main(String [] args){
        Point d = new Point();
        d.nhapDiem();
        d.inThongTin();
        Triangle tg = new Triangle();
        tg.nhapDiem();
        tg.kiemTraTamGiac();
        Quadrilateral bh = new Quadrilateral();
        bh.nhapDiem();
        bh.kiemTraTuGiac();
    }
}
