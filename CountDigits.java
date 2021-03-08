public class CountDigits {
    public static void main(String[] args) {
	    
        int num = 4562;
        int countDigit = 0;
        
        //Check whether the number N is equal to zero.
        //Increase the count of digits by 1 if N is not zero.
        //Reduce the number by dividing it by 10.
        //Repeat the above steps until the number is reduced to zero.
        
        while(num != 0){
            countDigit++;
            num = num/10;
        }
        
        System.out.println("Number of Digits: "+countDigit);
   }
}
