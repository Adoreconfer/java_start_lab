package Class;

public class Point {
    float x,y;
    ;

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Point() {
        this.x = x;
        this.y = y;
    }

    public void add(Point point1){
        point1.x+=6;
        point1.y+=9;
    }
}
