import java.util.*;

import java.util.concurrent.LinkedTransferQueue;

public class linkedtransferqueueforeach {
    public static void main(String args[]) {
        
        java.util.concurrent.LinkedTransferQueue<String> ldtqueue = new LinkedTransferQueue<>();
        
        ldtqueue.add("kamlesh");
        ldtqueue.add("vimlesh");
        ldtqueue.add("marccina");
        ldtqueue.add("dani");
 
        ldtqueue.stream().forEach(System.out::println);
 
 
     }
}
