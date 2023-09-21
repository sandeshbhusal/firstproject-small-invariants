class CircleRunner {
    // Returns if the point is inside the circle of radius = 25, centered around origin.
    public static boolean testcircle(int x, int y) {
        return (x * x) + (y * y) <= 25;
    }
}

public class circle {
    public static void main(String[] args) {
        CircleRunner runner = new CircleRunner();
        for (int i=-100; i< 100; i++){
            for(int j = -100; j < 100; j++) {
                boolean retvalue = runner.testcircle(i, j);
            } 
        }
    }
}
