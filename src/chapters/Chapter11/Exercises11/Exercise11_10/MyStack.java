package chapters.Chapter11.Exercises11.Exercise11_10;

import java.util.ArrayList;


public class MyStack  extends ArrayList<Object> {
public MyStack(){

}
public Object peek(){
    return super.get(super.size() - 1 );
}
public Object pop(){
    return super.remove(super.size() - 1);
}
public void push(Object o ){
    super.add(o);
}
public int getSize(){
    return super.size();
}
@Override
    public String toString(){
    return "Stack : " + super.toString();
}
}
