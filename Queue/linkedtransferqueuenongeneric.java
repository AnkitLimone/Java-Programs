import java.util.*;
import java.util.concurrent.LinkedTransferQueue;

public class linkedtransferqueuenongeneric {
    public static void main(String args[]) {
        
        LinkedTransferQueue ldtqueue = new LinkedTransferQueue();
        
        ldtqueue.add("kamlesh");
        ldtqueue.add("vimlesh");
        ldtqueue.add("marccina");
        ldtqueue.add("dani");
 
        Iterator itr = ldtqueue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
 
 
     }
}
