/*
Check wheather a number is armstrong number or not
-> number = 125
-> countOfDigits = 3 (as 125 contains 3 digits)
-> sum of each digit raise to total digits,
-> (1)^3 + (2)^3 + (5)^3
-> if above sum is equals the given number (125) then its a armstrong number 
*/

package Basic;
import javax.swing.JOptionPane;

public class ArmstrongNumber 
{
    public static void main(String[] args) 
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter any number"));
        int countOfDigits = 0;
        int temp = num;
        
        //counting digits 
        while(temp != 0)
        {
            countOfDigits++;
            temp = temp / 10;
        }

        //sum of each digits with power of count of digits
        int sum = 0;
        temp = num;
        while(temp != 0)
        {
            int dig = temp % 10; //if num is 125 it will store 5 in dig, if num is 12 it will store 2.
            sum = sum + (int)Math.pow(dig, countOfDigits); // Math.pow(base, power) is returns double type of value, that why we need to typecast it to integer.
            temp = temp / 10;
        }
        if(num == sum)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not");
        }
    }    
}
