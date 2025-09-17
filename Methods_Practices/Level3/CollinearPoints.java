public class CollinearPoints {
    public static boolean collinearBySlope(double x1,double y1,double x2,double y2,double x3,double y3) {
        double dx1 = x2-x1, dy1 = y2-y1;
        double dx2 = x3-x2, dy2 = y3-y2;
        // avoid division by zero: compare cross product
        return Math.abs(dy1*dx2 - dy2*dx1) < 1e-9;
    }

    public static boolean collinearByArea(double x1,double y1,double x2,double y2,double x3,double y3) {
        double area = 0.5 * (x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2));
        return Math.abs(area) < 1e-9;
    }

    public static void main(String[] args) {
        double x1=2,y1=4,x2=4,y2=6,x3=6,y3=8;
        System.out.println("By slope: " + collinearBySlope(x1,y1,x2,y2,x3,y3));
        System.out.println("By area: " + collinearByArea(x1,y1,x2,y2,x3,y3));
    }
}
