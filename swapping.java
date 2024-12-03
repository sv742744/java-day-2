import java.util.*;
class swapping {
    public static void main(String args []){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println("after swapping \n a="+a+"\n b="+b);
        System.out.println("swapping using +,-");
        a=a+b;
        b=a-b;
        a=a-b;
        /* for using assignmment 
        a+=b;
        b-=a;
        a-=b;*/
        System.out.println("after swapping using +,- \n a="+a+"\n b="+b);
        System.out.println("swapping using *,/");
        a=a*b;
        b=a/b;
        a=a/b;
        /* same methon using assignment operator
        a*=b;
        b/=a;
        a/=b;
        */
        System.out.println("after swapping \n a="+a+"\n b="+b);
    }

}