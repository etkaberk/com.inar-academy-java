package chapters.chapter08.checkpoints08;

public class checkpoint08_09 {
    public static void main(String[] args) {
        int[][][] x = new int[12][5][2];
        System.out.println("number of elements in array x --> " +(x.length * x[1].length*x[1][1].length));
        System.out.println("x's length is :" +x.length);
        System.out.println("x[]2 ' s length is : " + x[2].length);
        System.out.println("x[0][0]'s length is : " +x[0][0].length);

    }
}
