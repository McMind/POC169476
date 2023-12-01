public record Point2D(double x, double y) {
    public static void main(String[] args) {
        Point2D a1 = new Point2D(2,3);
        Point2D a2 = new Point2D(4,5);
        System.out.println(a1.distanceTo(a2));
    }
    public double distanceTo(Point2D otherPoint){
        return Math.sqrt(Math.pow(otherPoint.x-x,2)+Math.pow(otherPoint.y-y,2));
    }
}
