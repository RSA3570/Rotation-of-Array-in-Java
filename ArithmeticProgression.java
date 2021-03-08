public class ArithmeticProgression {
    public static void main(String[] args) {
        // We know the Arithmetic Progression series is like = 2, 5, 8, 11, 14 …. … 
        // In this series 2 is the stating term of the series . 
        // Common difference = 5 – 2 = 3 (Difference common in the series). 
        // so we can write the series as : 
        // t1 = a1 
        // t2 = a1 + (2-1) * d 
        // t3 = a1 + (3-1) * d 
        // . 
        // . 
        // . 
        // tn = a1 + (n-1) * d 

        // starting number
        int a = 2; 
        
        // Common difference
        int d = 3; 
        
        // N th term to be find
        int n = 5; 

        findApSeries(a, d, n);
    }

    static void findApSeries(int a, int d, int n){
        int currentTerm;
        currentTerm = a;

        for (int i = 1; i <=5; i++) {
            System.out.print(currentTerm+" ");
            currentTerm = currentTerm + d;
        }
    }
}
