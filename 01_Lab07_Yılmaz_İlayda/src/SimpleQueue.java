public class SimpleQueue {

    SimpleLinkedList queue;

    public SimpleQueue(){
        queue = new SimpleLinkedList();
    }

    public SimpleQueue( SimpleLinkedList queue ){
        this.queue = queue;
    }

    public void enqueue( String data ){
        queue.addToTail( data );
    }

    public void dequeue(){
        queue.removeFromHead();
    }

    public boolean isEmpty(){
        return (queue == null);
    }

    public void setQueue(SimpleLinkedList queue) {
        this.queue = queue;
    }

    public SimpleLinkedList getQueue() {
        return queue;
    }
}
