public class Node {

    public String data;
    public Node next;

    public Node( String data, Node next ){
        this.data = data;
        this.next = next;
    }

    public Node( String data ){
        this.data = data;
        this.next = null;
    }
    //methods
    public String getData(){
        return data;
    }
    public Node getNext(){
        return next;
    }
    public void setNext(Node next){
        this.next = next;
    }
    public void setData(String data){
        this.data = data;
    }
}
