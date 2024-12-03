import java.util.*;
class xorequal  {
    public static void main (String [] args ){
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        if((a^b)==0)
        {
            System.out.println("a and b have same values");
        }
        else
        {
                System.out.println("a and b not have same values");
        }
    }
} 