package chapters.Chapter13.Exercises13.exercise13_08;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException{
        MyStack stack = new MyStack();
        MyStack stack1 = stack;
        MyStack stack3 = (MyStack) stack.clone();

        System.out.println(stack == stack1);
        System.out.println(stack == stack3);

    }
}
