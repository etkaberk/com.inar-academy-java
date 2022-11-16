package chapters.Chapter10.Exercises10;

import javax.jws.soap.SOAPBinding;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Exercise10_24_TestMyCharacter {
    public static void main(String[] args) {
        MyCharacter myCharacter = new MyCharacter('A');
        MyCharacter a = MyCharacter.valueOf('z');
        System.out.println(myCharacter);
        System.out.println(a);
        System.out.println(MyCharacter.compare('z','a'));
        System.out.println(MyCharacter.compare('a','z'));
        System.out.println(myCharacter.compareTo(a));
        System.out.println(MyCharacter.isDigit('a'));
        System.out.println(MyCharacter.isLetter('a'));
        System.out.println(MyCharacter.toUpperCase('z'));



    }
}
