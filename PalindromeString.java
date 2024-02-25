/*
check weather a string is palindrome or not
Example1 :
string = "hello"   reversedString = "olleh"
-> hello is not eqauls to reversedString 
-> so, its not palindrome
Example2 :
string : "madam"    reversedString = "madam"
-> reversedString is eqauls to original string
-> so, it a palindrome string
*/

package Basic;
import javax.swing.JOptionPane;

public class PalindromeString 
{
    public static void main(String args[])
    {
        String string = JOptionPane.showInputDialog("Enter any string");
        String reversedString = "";
        for(int i=string.length()-1; i>=0; i--)
        {
            reversedString += string.charAt(i);
        }
        if(string.equals(reversedString))
        {
            System.out.print("Palindrome");
        }
        else
        {
            System.out.print("Not palindrome");
        }
    }
}