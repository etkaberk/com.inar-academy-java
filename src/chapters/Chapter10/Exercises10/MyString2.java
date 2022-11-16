package chapters.Chapter10.Exercises10;

public class MyString2 {
    private char[] chars;

    public MyString2(String s) {
        chars = s.toCharArray();
    }

    public MyString2(char[] chars) {
        this.chars = chars;
    }

    public int compare(String s) {
       for(int i =  0 ; i < s.length() ; i++ ){
           if(chars[i] > s.charAt(i)){
               return 1;
           }else if(chars[i] < s.charAt(i)){
               return -1;
           }else{
               continue;
           }
       }
    return  0;

    }

    public MyString2 substring(int begin) {
    char[] result = new char[this.chars.length - begin];
    int count = 0;
    for(int i = begin;i < chars.length;i++){
        result[count++] = this.chars[i];
    }
    String s = createString(result);
    return new MyString2(s);
    }

    public String createString(char[] array) {
        String result = "";
        for(int i = 0; i < array.length; i++){
            result += array[i];
        }
    return result;
    }

    public MyString2 toUpperCase() {
        for(int i = 0; i < chars.length; i++){
            if(Character.isLetter(this.chars[i])){
                this.chars[i] = Character.toUpperCase(this.chars[i]);
            }
        }
    String s = createString(this.chars);
        return new MyString2(s);

    }

    public char[] toChars() {
        return  chars;

    }
public String toString(){
        return createString(this.chars);
}
    public static MyString2 valueOf(boolean b) {
    return b ? new MyString2("True") : new MyString2("False");

    }


}
