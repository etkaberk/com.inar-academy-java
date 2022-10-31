package chapters.chapter09.checkpoints09;

public class checkpoint09_12_Test {
    public static void main(String[] args) {
       // A a = new A();--->>>> this is wrong it is waiting for an arguments
        //a.print();
    }

}
class A{
    String s;
    A(String newS){
        s = newS;
    }
public void print(){
    System.out.println(s);
}
}