// Leap year or not 
//  formulas:
//  year % 400 == 0   
//  year % 4 == 0 && year % 100 != 0
           


public class q8 {
    public static void main(String[] args) {

        int year  = 2010;

        if (year % 400 == 0) {
            System.out.println("year is leap year");
        }else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("year is leap year");

            
        }else {
            System.out.println("year is not leap");
        }
        
    }
    
}
