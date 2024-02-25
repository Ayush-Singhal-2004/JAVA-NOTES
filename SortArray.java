/*
Sort array in ascending order
array = [2, 3, 1, 5, 4]
sorted array = [1, 2, 3, 4, 5]
*/

package Basic;
import javax.swing.JOptionPane;

public class SortArray 
{
    public static void main(String args[])
    {
        int arr[] = new int[5];

        //input in array
        for(int i=0; i<5; i++)
        {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter " + (i+1) + " number"));
        }

        //sorting array in asc order
        for(int i=0; i<5; i++)
        {
            for(int j=i+1; j<5; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        //printing sorted array using foreach loop
        for(int num : arr)
        {
            System.out.println(num);
        }
    }
}
