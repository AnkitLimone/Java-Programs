import java.util.Iterator;
import java.util.concurrent.LinkedTransferQueue;

public class linkedtransferqueueiterator {
    public static void main(String args[]) {
        
       LinkedTransferQueue<String> ldtqueue = new LinkedTransferQueue<>();
       
       ldtqueue.add("kamlesh");
       ldtqueue.add("vimlesh");
       ldtqueue.add("marccina");
       ldtqueue.add("dani");

       Iterator<String> itr = ldtqueue.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }


    }
}
