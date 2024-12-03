import java.util.*;
class swapping {
    public static void main(String args []){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        // swapping using temp//
        int c=a;
        a=b;
        b=c;
        System.out.println("after swapping using temp ::\n a="+a+"\n b="+b);
        // swapping using +,-//
        a=a+b;
        b=a-b;
        a=a-b;
        /* for using assignmment 
        a+=b;
        b-=a;
        a-=b;*/
        System.out.println("after swapping using +,- ::\n a="+a+"\n b="+b);
        // swapping using */ //
        a=a*b;
        b=a/b;
        a=a/b;
        /* same methon using assignment operator
        a*=b;
        b/=a;
        a/=b;
        */
        System.out.println("after swapping usng */:: \n a="+a+"\n b="+b);
        // swapping using bitwise //
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("after swapping using  bit wise ^^ :: \n a="+a+"\n b="+b);

    }

}