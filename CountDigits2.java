public class CountDigits2 {
     public static void main(String[] args) {
         long num = 345289467;

        //  int CountDigits = (int)Math.floor(Math.log10(num)+1);

        //  System.out.println("Count Digits:"+CountDigits);

        // String cd = Integer.toString(num);
        // int cd1 = cd.length();
        // System.out.println("Count Digits:"+cd1);
        System.out.println("Count Digits:"+countDigit(num));
        
     }

     static int countDigit(long n)
        {
            if (n == 0)
                return 0;
            return 1 + countDigit(n / 10);
        }
}
