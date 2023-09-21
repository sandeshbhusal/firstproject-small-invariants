public class newtest {
    public static void main(String[] args) {
        testing_new ntest = new testing_new(1, 2, 0);
        // for (int i = 1; i < 100; i ++ ) {
            // ntest.test_check( i % 2);
        // }
        // ntest.z = -5;
        // ntest.test_check();
        // ntest.z = -10;
        // ntest.test_check();
        ntest.z = -10;
        ntest.y = 3;
        ntest.test_check();
        
        ntest.z = -14;
        ntest.y = 5;
        ntest.test_check();
        
        ntest.z = -1;
        ntest.y = -5;
        ntest.test_check();
        
        ntest.z = -7;
        ntest.y = 8;
        ntest.test_check();
 
        ntest.z = -9;
        ntest.y = 10;
        ntest.test_check();
        
        // ntest.test_check(-5);
        // ntest.test_check(-10);
    }
}

class testing_new {
    int x;
    public int y;
    public int z;
    
    testing_new(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void test_check() {
        if (z < 0)
            x = y + z;
        else
            y = 2 * x;
    }
}