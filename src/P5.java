/* Binary Toggle Pattern

 1
 1 0
 1 0 1
 1 0 1 0
*/
public class P5 {
    public static void main(String[] args) {
        int r,c,k;
        for(r=1;r<=4;r++)
        {
            k=1;
            for(c=1;c<=r;c++)
            {
                System.out.print(" "+k);
                if(k==1)
                {
                    k=0;
                }
                else
                {
                    k=1;
                }
            }
            System.out.println(" ");
        }
    }
}
