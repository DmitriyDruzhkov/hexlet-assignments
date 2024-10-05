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

    public Point getMidPoint() {
        return new Point((this.beginPoint.getX()+this.endPoint.getX())/2, (this.beginPoint.getY()+this.endPoint.getY())/2);
    }
    }