public class SimpleStackWithQueue{

    SimpleQueue queue1;
    SimpleQueue queue2;

    public SimpleStackWithQueue(){
        queue1 = new SimpleQueue();
        queue2 = new SimpleQueue();
    }

    public SimpleStackWithQueue( SimpleLinkedList q1, SimpleLinkedList q2 ){
        this.queue1 = new SimpleQueue( q1 );
        this.queue2 = new SimpleQueue();
    }

    public void push( String data ){

        SimpleLinkedList linked1 = queue1.getQueue();
        SimpleLinkedList linked2 = queue2.getQueue();
        queue2.enqueue( data );

        while( linked1.isEmpty() != true ){
            linked2.addToTail( linked1.getData() ); //Pushes the head data to queue2
            linked1.removeFromHead(); // Removes the head from queue2 so the data is updated
        }

        SimpleQueue temp = queue1;
        queue1 = queue2;
        queue2 = temp;

    }

    public SimpleQueue pop(){
        queue1.dequeue();
        return queue1;
    }

    public String toString(){

        SimpleLinkedList linked1 = queue1.getQueue();
        SimpleLinkedList linked2 = queue2.getQueue();

        String stringQueue1 = "";
        String stringQueue2 = "";
        String output = "";

        Node temp = linked1.getHead();

        //Queue1
        if( temp == null ){
            stringQueue1 = "empty";
        }
        else{
            while( temp.getNext() != null ){
                stringQueue1 = stringQueue1 + temp.getData() + ", ";
                temp = temp.getNext();
            }

            stringQueue1 = stringQueue1 + temp.getData();
        }

        //Queue2
        temp = linked2.getHead();

        if( temp == null ){
            stringQueue2 = "empty";
        }
        else {
            while( temp.getNext() != null ){
                stringQueue2 = stringQueue2 + temp.getData() + ", ";
                temp = temp.getNext();
            }
            stringQueue2 = stringQueue2 + temp.getData();
        }

        output = "Queue 1: " + stringQueue1 + "\n" + "Queue 2: " + stringQueue2;

        return output;
    }
}