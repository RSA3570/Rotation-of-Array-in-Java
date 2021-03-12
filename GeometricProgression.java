public class GeometricProgression {
    public static void main(String[] args) {


        // We know the Geometric Progression series is like = 2, 4, 8, 16, 32 ……. 
        // In this series 2 is the stating term of the series . 
        // Common ratio = 4 / 2 = 2 (ratio common in the series). 
        // so we can write the series as :
        // t1 = a1 
        // t2 = a1 * r(2-1) 
        // t3 = a1 * r(3-1) 
        // t4 = a1 * r(4-1) 
        // . 
        // . 
        // . 
        // . 
        // tN = a1 * r(n-1) 

        int a = 2; // starting number
        int r = 3; // Common ratio
        int n = 5; // N th term to be find

        findGPSeries(a, r, n);
    }

    static void findGPSeries(int a, int r, int n)
    {
        int curr_term;
        curr_term = a;
        for (int i = 1; i <= n; i++) {
            System.out.print(curr_term+ " ");
            curr_term = a * (int)Math.pow(r, i);
        }
    }

}
