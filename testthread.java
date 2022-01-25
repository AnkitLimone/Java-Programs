import java.util.*;

class runnabledemo implements Runnable {
    private Thread t;
    private String threadName;

    runnabledemo(String name){
        threadName = name;
        System.out.println("CReating "+ threadName);
    }
    public void run(){
        System.out.println("Running "+ threadName);
        try {
            for(int i=4;i>0;i--){
                System.out.println("Thread: "+ threadName + ", "+ i);
                Thread.sleep(50);
            }
        }       catch (InterruptedException e) {
                    System.out.println("Thread "+ threadName + " interrupted.");
                        //TODO: handle exception
                }
                System.out.println("Thread "+threadName + "exiting.");
    }
        public void start() {
            System.out.println("Starting "+ threadName);
            if (t==null){
                t = new Thread (this, threadName);
                t.start();
            }
        }

}
    public class testthread{
        public static void main(String args[]){
            runnabledemo r1 = new runnabledemo("thread-1");
            r1.start();

            runnabledemo r2 = new runnabledemo("thread-2");
            r2.start();
        }
    }
