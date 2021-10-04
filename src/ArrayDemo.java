/* W.A.P to create an array of n integers where n is given by the user
   Then ask the user to input values in that array & finally
   display the array,sum & average of all array numbers
   using Scanner*/
import java.util.Scanner;
public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[];
        int n,i,sum=0;
        System.out.println("Enter array size");
        n=sc.nextInt();
      a=new int[n];
        System.out.println("Enter array elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        System.out.println("Array elements are");
        for(i=0;i<n;i++)
        {
            System.out.println(""+a[i]);
        }
        System.out.println("Sum is "+sum);
        System.out.println("Average is "+(float)sum/n);
    }
}
