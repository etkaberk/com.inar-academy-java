package chapters.Chapter11.Checkpoints11;


class Checkpoint11_04 {
    public Checkpoint11_04(){
        System.out.println("class's no arg constructor is invoked");
    }
}
class B extends Checkpoint11_04{

}
class C {
    public static void main(String[] args){
        B b = new B();
    }
}
//it wants a public class C package because of that ı wrote just class and the ı could reach tbe no arg constructor from class Checkpoint11_04