package chapters.chapter09.checkpoints09;

public class checkpoint09_11_ShowErrors {

}
/**
public static void main(String[] args) {
 ShowErrors t = new ShowErrors(5);
it isn't expecting an arguments!!!
 **/

/**   public static void main(String[] args) {
        ShowErrors t = new ShowErrors();
    t.x();
    }   public static void main(String[] args) {
        ShowErrors t = new ShowErrors();
    t.x();
    it cannot solve the method x !
   **/

/**
 *  public void method1(){
 *         Circle c ;
 *         System.out.println("What is radius " + c.getRadius());
 *         c = new Circle();
 *     }
 *     it may not have been initialized!!!
 */

/**
 *   public static void main(String[] args) {
 *         C c = new C(5.0);
 *         System.out.println("c.value");
 *     }
 * class C{
 *         int value = 2;
 * }cannot referenced by a static !!! ?????
 */