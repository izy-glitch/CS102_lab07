public class SimpleStackWithQueueTest {

    public static void main(String args[] ){

        SimpleStackWithQueue queue1 = new SimpleStackWithQueue();
        SimpleStackWithQueue queue2 = new SimpleStackWithQueue();
        queue1.push("Hello");
        queue1.push("I am İlayda");
        queue1.push("From the Moon");
        System.out.println( queue1.toString() );

        queue1.pop();

        System.out.println( queue1.toString() );

        queue2.push ( " Meow ");
        queue2.push ( " I might be a cat ");

        System.out.println( queue2.toString() );


    }
}

