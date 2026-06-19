//reverse the number
public class q12 {

    public static void main(String[] args) {
        
    
     //variables initialization
        int num = 1234, reverse = 0, rem;


        //loop to find reverse number
        while (num != 0)
        {
            rem = num % 10;   //  last digit one by one - remainder 
            reverse = reverse * 10 + rem; // using this formula add remainder 
            num /= 10;   // get quotient
        };

        //output
        System.out.println ("Reversed Number: " + reverse);
        
    }
    
}
