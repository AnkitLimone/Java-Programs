import java.util.*;

 
class stackiterator
{
    
    public static void main(String[] args)
    {
        
        Stack<String> stack = new Stack<>();
 
 
        stack.push("mohan");
        stack.push("lokesh");
        stack.push("rajesh");
 
        /* Using an iterator */
 
        
        Iterator<String> itr = stack.iterator();

        

 
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }

}