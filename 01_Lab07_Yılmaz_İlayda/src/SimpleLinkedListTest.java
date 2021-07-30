public class SimpleLinkedListTest {

    public static void main(String args[] ){

        SimpleLinkedList linked = new SimpleLinkedList();

        linked.addToTail( " Hi ");
        linked.addToTail( " I am a Nymph ");
        linked.addToTail( " From Ancient Greek ");

        System.out.println( linked.toString() );

        System.out.println( linked.get( " Hi " ).toString() );

        linked.removeFromHead();
        System.out.println( linked.toString() );
        linked.removeFromHead();
        System.out.println( linked.toString() );
        linked.removeFromHead();
        System.out.println( linked.toString() );



    }


}
