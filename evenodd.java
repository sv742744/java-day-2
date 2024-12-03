import java.util.*;
class evenodd{
    public static void main (String [] args ){
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        if((a&1)==0)
        {
            System.out.println("even");

        }
        else if ((a&0)==0)
        {
            System.out.println("odd");
        }
    }
}      
