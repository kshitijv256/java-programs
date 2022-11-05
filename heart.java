public class heart{
    
    public static void main(String[] args) {
        StdDraw.setXscale(-2, +2);
        StdDraw.setYscale(-2, +2);
        StdDraw.setPenColor(StdDraw.RED);

        double[] x = {-1,0,1,0};
        double[] y = {0,-1,0,1};
        StdDraw.filledPolygon(x, y);

        StdDraw.filledCircle(0.5,0.5, 1/Math.sqrt(2));
        StdDraw.filledCircle(-0.5,0.5, 1/Math.sqrt(2));
    }
}

