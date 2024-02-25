/*
check wheather a given number is prime or not
-> number : 6       not prime
-> number : 13       prime 
*/

package Basic;
import javax.swing.JOptionPane;

public class PrimeNumber 
{
    public static void main(String[] args) 
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter any number"));
        int div;
        for(div=2; div<num; div++)    
        {
            if(num % div == 0)
            {
                System.out.println("Not Prime");
                return;
            }
        }
        if(num == div)
        {
            System.out.println("Prime");
        }
    }
}
