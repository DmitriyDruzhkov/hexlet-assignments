package exercise;

public class Segment {
    Point beginPoint;
    Point endPoint;
    Point midPoint;
    public Segment(Point beginPoint, Point endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }
    public Point getBeginPoint() {
        return this.beginPoint;
    }
    public Point getEndPoint(){
        return this.endPoint;
    }
    public Point getMidPoint(Point point1, Point point2) {
        var x1 = (point1.getX() + point2.getX())/2;
        var y1 = (point1.getY() + point2.getY())/2;
        return new Point(x1, y1);
    }

    }