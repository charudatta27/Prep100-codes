//sum of the digit number

// Modulo Operator % : We’ll use this to extract the digits from the number.
// Divide Operator / : We’ll use it to shorten the number by 1 digit.

public class q11 {
    public static void main(String[] args) {

        int num = 3424, sum = 0;

        while(num!=0){  // until gets 0 
            sum += num % 10;  //  12345 % 10 = 5
            num = num / 10;   //   12345 / 10 = 1234
     

        }
              System.out.println("Sum of digit : " + sum);

        
    }
    
}
