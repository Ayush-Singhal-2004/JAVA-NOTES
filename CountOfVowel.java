/*
Count of vowels present in a string 
Example:
String = "hello world"
output = 3
"hello world" contains 3 vowel characters -> 'e', 'o', 'o'
*/

package Basic;
import javax.swing.JOptionPane;

public class CountOfVowel 
{
    public static void main(String args[])
    {
        String string = JOptionPane.showInputDialog("Enter any string");
        int countOfVowels = 0;
        
        //iterating at each index of the string, and cheking wheather its a vowel or not
        for(int i=0; i<string.length(); i++)
        {
            char ch = string.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                countOfVowels++;
            }
        }
        System.out.println("Count of vowels = " + countOfVowels);
    }    
}
