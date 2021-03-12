public class QuadraticEquations {
    public static void main(String[] args) {
        int a = 1, b = -7, c = 12;

        double d = Math.pow(b, 2) - (4*a*c);

        if (d<0) {
            System.out.println("Roots are complex");
        }else if (d == 0) {
            System.out.println("Roots are Real and Same");
        }else {
            System.out.println("Roots are real and different.");
        }
    }
}
