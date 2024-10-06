package exercise;

// BEGIN
public class Cottage implements Home {
    private double area;
    private double balconyArea;
    private int floorCount;

    Cottage(double area, int floorCount) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floorCount = floorCount;
    }

    public double getArea() {
        return area + balconyArea;
    }
    @Override
    public int compareTo(Home another) {
        if (getArea() > another.getArea()) {
            return 1;
        } else if (getArea() < another.getArea()) {
            return -1;
        } else return 0;
    }
    @Override
    public String toString() {
        return floorCount+" этажный коттедж площадью " + getArea() + " метров";
    }
}
// END
