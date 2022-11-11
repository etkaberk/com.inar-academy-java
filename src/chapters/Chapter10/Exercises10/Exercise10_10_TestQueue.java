package chapters.Chapter10.Exercises10;

public class Exercise10_10_TestQueue {
    public static void main(String[] args) {
        Queue one = new Queue();
        for (int i = 1; i < 21; i++) {
            one.enqueue(i);

        }
        while(!one.doEmpty())
        for (int i = 0; i < one.getSize(); i++) {
            System.out.println(one.dequeue() );


        }

    }

}
