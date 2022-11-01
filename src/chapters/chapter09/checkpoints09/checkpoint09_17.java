package chapters.chapter09.checkpoints09;

public class checkpoint09_17 {
    int i ;
    static String s ;
    void imethod(){

    }
static void smethod(){

}
    // non-static methods can't invoked in a static context !!!!!



    public static void main(String[] args) {
        //System.out.println(checkpoint09_17.i);
        System.out.println(checkpoint09_17.s);
        //checkpoint09_17.imethod();
        checkpoint09_17.smethod();;
        //System.out.println(checkpoint09_17.i);
        System.out.println(checkpoint09_17.s);
        //checkpoint09_17.imethod();
        checkpoint09_17.smethod();
    }
}
