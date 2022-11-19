package chapters.Chapter11.Exercises11.Exercise11_10;

public class Exercise11_10 {
    public static void main(String[] args) {
        MyStack stackEtka = new MyStack();
        stackEtka.push(4120);
        stackEtka.push(2105);
        stackEtka.push(12345);
        stackEtka.push(9876);
        System.out.println(stackEtka.peek());
        stackEtka.pop();
        display(stackEtka);
    }

    public static void display(MyStack stackEtka) {
        while(!stackEtka.isEmpty()){
            System.out.println(stackEtka.pop().toString());
        }
    }

}
