import java.util.LinkedList;
import java.util.logging.Logger;

public class customQueue {
    public static LinkedList<String> queue = new LinkedList<>();
    public static void main(String[] args) {
        queue.add("5");
        queue.add("3");
        queue.add("1");
        queue.add("6");
        queue.add("2");
    }   

    public static void enqueue(String element) {
        Logger logger = Logger.getAnonymousLogger();
        logger.info(String.valueOf(queue.add("8")));
  
    }

    public static String dequeue() {
        String firstInQueue = queue.getFirst();
        queue.removeFirst();
        return firstInQueue;
    }

    public static String first() {
        return queue.getFirst();
    }

}

