package HW0520;

public class Point implements Comparable<Point>{
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int compareTo(Point other){
        if(this.x != other.x){
            return Integer.compare(this.x, other.y);
        } else {
            return Integer.compare(this.y, other.y);
        }
    }

    public static double distance(Point p1, Point p2) {
        int dx = p1.getX() - p2.getX();
        int dy = p1.getY() - p2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString(){
        return this.getX() + ", " + this.getY();
    }
}
