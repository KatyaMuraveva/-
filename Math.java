import java.util.Random;
public class Math {
    private double pi;
    private Random random;

    {
        pi = 3.14;
        random = new Random();
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int product(int a, int b) {
        return a * b;
    }

    public int difference(int a, int b) {
        return a - b;
    }

    public float quotient(float a, float b) {
        return a / b;
    }

    public int min(int a, int b) {
        return a < b ? a : b;
    }

    public int min(int a, int b, int c) {
        return min(min(a, b), c);
    }

    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    public int pow(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return a * pow(a, b - 1);
        }

    }
    public int nod (int a, int b){
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            return a;
        }
            public int nok ( int a, int b){
            return a * (b / nod(a, b));
        }

        public double sin ( double a){
            double b = pi / 180;
            return a * b;
        }


        public int randomTwo() {
            int a = 11;
            int b = 99;
            return random.nextInt((b - a) + 1);
        }
    }
