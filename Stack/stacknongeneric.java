import java.util.*;

 
class stacknongeneric
{
    
    public static void main(String[] args)
    {
       
        Stack stack = new Stack();
 
 
        
 
       String s1 = (String) stack.push("mohan");
       String s2 = (String) stack.push("lokesh");
       String s3 = (String) stack.push("rajesh");

       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s3);

    }

}