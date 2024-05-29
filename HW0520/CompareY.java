package HW0520;
import java.util.Comparator;
public class CompareY implements Comparator<Point>{

    @Override
    public int compare(Point p1, Point p2){
        if (p1.getY() != p2.getY()){
            return Integer.compare(p1.getY(), p2.getY());
        }else {
            return Integer.compare(p1.getX(), p2.getX());
        }
    }
}
