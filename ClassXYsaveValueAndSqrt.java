public class ClassXYsaveValueAndSqrt {
    public static void main(String[] args) {
        public class point {
            private int x;
            private int y;
            private double distance;
            public point(int a, int b){
                intial(a, b);
            }
            public void intial(int m, int n){
                x = m;
                y = n;
            }
            public void dis(){
                distance = sqrt(x*x+y*y);
            }
            public void show(){
                System.err.printf("x=%d, y=%d, distance=%5.2f", x, y, distance);
            }
        }
    }
}
