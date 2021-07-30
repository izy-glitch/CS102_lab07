public class SimpleLinkedList {

    public Node head;

    public SimpleLinkedList(){
        head = null;
    }

    public void addToTail ( String data ){
        Node node = new Node( data );
        Node tempNode = head;

        if( head == null ){
            head = node;
        }
        else{
            while( tempNode.getNext() != null ){
                tempNode = tempNode.getNext();
            }
            tempNode.setNext( node );
        }
    }

    public String removeFromHead(){
        if ( !isEmpty() ) {
            head = head.getNext();
            return toString();
        }
        else {
            return "List is empty!";
        }
    }

    public Node get( String data ){

        Node tempNode = head;
        while( tempNode != null ) {
            if( ( tempNode.getData()).equals( data ) )
                return tempNode;
            tempNode = tempNode.getNext();
        }
        return null;
    }

    public boolean isEmpty(){
        return ( head == null );
    }

    public String toString(){
        String output = "";
        Node tempNode = head;
        int count = 1;
        if( head == null )
            output = "List is empty";
        else{
            while( tempNode.getNext() != null ){
                output = output + " Data " + count + ": " + tempNode.getData() + ", ";
                tempNode = tempNode.getNext();
                count++;
            }
            output = output + "Data " + count + ": " + tempNode.getData();
        }
        return output;
    }

    public String getData(){
        return head.getData();
    }

    public Node getHead(){
        return head;
    }
}
