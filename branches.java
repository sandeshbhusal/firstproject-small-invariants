public class branches {
    public static int testbranch1() {
        Brancher b = new Brancher();
        for (int i = -10; i< 100; i++) // b
            for (int j = i + 1; j < i + 4; j++) // a
                if (b.check(i, j) == i) return i;

        return -1;
    }

    public static int testbranch2() {
        Brancher b = new Brancher();
        for (int i = -10; i< 100; i++) // a
            for (int j = i + 1; j < i + 4; j++) // b
                if (b.check(j, i) == j) return j;
            
        return -1;
    }
    
    public static int testbranch_comb() {
        Brancher b = new Brancher();
        for (int i = -10; i< 100; i++) // a
            for (int j = -10; j < 100; j++) // b
                if (b.check(i, j) == i) return i;

        // Should be unreachable in all code above..
        return -1;
    }

    public static void main(String[] args) {
        testbranch1();
        testbranch2();
        testbranch_comb();
    }
}

class Brancher {
    static int check(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    } 
}