import java.util.LinkedList;
import java.util.Queue;

public class Queus {

    public static void main(String[] args){

    }

    void sample(){
        Queue<Integer> queue = new LinkedList();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
    }

    /*
    Adding element to queue()
    .add() --> throws exception
    and
    .offer() --> returns false

    removing element from queue
    .remove() --> throws excption
    .poll() --> returns null if queue is emoty
     */


}
