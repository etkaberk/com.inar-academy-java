package chapters.Chapter10.Exercises10;



public class Queue {
    public static final int DEFAULT_CAPACITY = 8 ;

    private int size;
    private  int[] elements;

    public Queue(){
        elements = new int[8];
        size = 0;
    }


public void enqueue(int v){
        if(elements.length <= size){
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements,0,temp,0,elements.length);
            elements = temp;
        }
        elements[size++] = v;
}

public int dequeue(){
        int result = elements[0];
    for (int i = 1; i < getSize(); i++) {
        elements[i-1] = elements[i];

    }
        size--;
        return result;
}


 public int getSize() {
    return this.size;
}

    public boolean doEmpty() {
        return getSize() == 0;
    }
}