import java.util.*;
class assignmentoperators   {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value =");
        int a=sc.nextInt();
        System.out.println("a="+(a+=10));
        System.out.println("a="+(a-=20));
        System.out.println("a="+(a*=2));
        System.out.println("a="+(a%=3));
   }
}