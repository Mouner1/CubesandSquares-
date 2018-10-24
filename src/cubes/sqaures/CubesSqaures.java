 /*
Mouner Dabjan
22 October 2018
This program will prompt the user to enter a number, then find its sqaure, cube, or the value of it with a power 
 */

package cubes.sqaures;
import java.util.Scanner; 
/**
 *
 * @author modab5310
 */
public class CubesSqaures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //variables
        
        int option = 0; 
        int base;
        int exponent;
        int result = 1;
        int count = 1; 
        int number; 
        int number2; 
        
        
        
        Scanner keyedInput = new Scanner(System.in); 
       
        // information
        
        System.out.println("Please choose one of the options below");
        System.out.println("1........Get the value of a number sqaured");
        System.out.println("2........Get the value of a number cubed");
        System.out.println("3........Get the value of a number with any power");
        System.out.println("4........Exti the program");
        
        option = keyedInput.nextInt(); 
        
        // if - statments
        
        if (option==1)
        {
            System.out.println("Enter the number you want to square");
            number = keyedInput.nextInt(); 
            for (int i = 1 ; i<=number ; i++)
            {
                System.out.println(i*i);
            }
                
        }
        
        if (option==2)
        {
            System.out.println("Enter the number you want to cube");
            number2= keyedInput.nextInt(); 
            for (int i = 1 ; i<=number2 ; i++)
            {
                System.out.println(i*i*i);
            }
        }
        
        if (option==3)
        {
            System.out.println("Enter your base:");
            base = keyedInput.nextInt(); 
            System.out.println("Enter your exponent");
            exponent = keyedInput.nextInt();
            
            while (count <=exponent)
            {
                if (exponent!=0)
                {
                    result = base*result;
                    count++;
                }
                else {
                    System.out.println(base + "to the power of " + exponent + " is" + base);
                }
                    
            }
            System.out.println(base + "to the power" + exponent + "is" +result);
           
        }   
            
            
            
        if (option==4)
        {
            System.out.println("Thank you for trying our program!");
        }
}
