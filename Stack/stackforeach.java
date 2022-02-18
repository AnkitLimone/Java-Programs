import java.util.*;

 
class stackforeach
{
    
    public static void main(String[] args)
    {
       
        Stack<String> stack = new Stack<>();
 
 
        stack.push("mohan");
        stack.push("lokesh");
        stack.push("rajesh");
 
        /* Using an forEach() */
        stack.stream().forEach(S -> System.out.println(S));
        stack.stream().forEach(System.out::println);
        

    }

}