import java.util.Scanner;

public class ArrayLargest {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[];
        int n, i, max;
        System.out.println("Enter array size");
        n = sc.nextInt();
        a = new int[n];
        System.out.println("Enter array elements");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        max=a[0]; //Assume as of now arr[0] is the largest element

        for(i=1;i<n;i++)
        {
            if(a[i]>max)
                max=a[i];
        }

        System.out.print("The largest element is "+max);
    }
}