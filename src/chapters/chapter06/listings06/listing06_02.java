package chapters.chapter06.listings06;
//test void method
public class listing06_02 {
    public static void main(String[] args){
        System.out.print("The grade is ");
        printGrade(78.5);
    }
    public static void printGrade(double score){
        if (score >=90.0){
            System.out.println('A');
        }
        else if (score >= 80.0){
            System.out.println('B');
        }
        else if (score >= 70.0 ){
            System.out.println('C');
        }
        else if (score >= 60.0){
            System.out.println('D');
        }
        else{
            System.out.println('F');
        }
    }
}
