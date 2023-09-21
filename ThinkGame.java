class ThinkOfANumber {
    public int returns_number(int a) {
        int b = a * 2;
        int c = b + 9;
        int d = c - 3;
        float e = d / 2;
        float f = e - (float) a;
        int g = (int) f;
        return g;
    }

    public int returns_number_nonfloat(int a) {
        int b = a * 3;
        int c = b - a;
        int d = c - 5;
        int e = 2;
        int f = e * 2 + 1;
        int g = d + f;
        return g;
    }
}

public class ThinkGame {
    static ThinkOfANumber generator;

    public static void smallset_thinkofanumber_test() {
        for (int i = 0; i < 10; i++) {
            int result = generator.returns_number(i);
            // System.out.println("Result for returns_number(11): " + result);
        }

        for (int j = 0; j < 10; j++) {
            int result = generator.returns_number(j);
            // System.out.println("Result for returns_number(12): " + result);
        }
    }

    // public static void bigset_thinkofanumber_test() {
    //     // Check to see if we have any different invariants generated within these functions.
    //     for (int i = 0; i < 1000; i++) {
    //         int result = generator.returns_number(i);
    //         // System.out.println("Result for returns_number(11): " + result);
    //     }

    //     for (int j = 0; j < 1000; j++) {
    //         int result = generator.returns_number(j);
    //         // System.out.println("Result for returns_number(12): " + result);
    //     }
    // }

    public static void main(String[] args) {
        generator = new ThinkOfANumber();

        smallset_thinkofanumber_test();
        // bigset_thinkofanumber_test();
    }
}
