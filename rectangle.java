// Invariant should be: x >=0 and x <= 25 and y >=0 and y <=25 (conjunction of 4 )

public class rectangle {
    public static void main(String[] args) {
        // test(100, 100);
        test_check();
        // move_check();
    }

    static void test_check() {
        rectangle_obj obj = new rectangle_obj(10, 10, 0, 0);
        obj.move_rect(3, 3);
        obj.point_inside(4, 4);
        obj.move_rect(5, 5);
        obj.point_inside(10, 10);
        obj.move_rect(10, 10);
        obj.point_inside(2, 2);
        obj.point_inside(9, 9);
    }
    static void move_check() {
        rectangle_obj obj = new rectangle_obj(10, 10, 0, 0);
        for (int i =-25; i <=25; i++){
            obj.move_rect(i, i);
            obj.point_inside(obj.left - 1, obj.bottom - 1);
            obj.point_inside( i + 1, i + 1);
        }
    }

    static void test(int max_x, int max_y) {
        RectTest tester = new RectTest();
        for (int i = 0; i <= max_x; i++) {
            tester.test(i, 4);
            tester.test(4, i); 
        }

        for (int i =0; i<=max_y; i++)
            for (int j = 0; j<=100; j++)
                tester.test(i, j);
   }
}

class rectangle_obj {
    public int left;
    public int bottom;
    public int width;
    public int height;

    int max(int x, int y) {
        if (x > y)
            return x;

        return y;
    }

    rectangle_obj(int w, int h, int left, int bottom) {
        this.width = w;
        this.height = h;

        if (left < 0)
            left = 0;
        if (bottom < 0)
            bottom = 0;

        this.left = left;
        this.bottom = bottom;
    }

    void move_rect(int x, int y) {
        if (x < 0)
            x = 0;
        if (y < 0)
            y = 0;
        
        if (x + this.width > 25)
            this.width = 0;
        else 
            this.width = x + this.width;

        if (y + this.height > 25)
            this.height = 0;
        else
            this.height = y + this.height;
        
        this.left = x;
        this.bottom = y; 
    }

    boolean point_inside(int x, int y) {
        return (x >= this.left && x <= (this.left + this.width) && y >= this.bottom && y <= (this.bottom + this.height));
    }
}

class RectTest {
    public static boolean test(int i, int j) {
        return (i >=0 && i <= 25 && j >=0 && j <= 25);
    }
}