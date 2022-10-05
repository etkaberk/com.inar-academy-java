package chapters.chapter05.exercises05;

public class Chapter05_40 {
    public static void main(String[] args){
        int coin ;
        int headsCount = 0 ;
        int tailsCount = 0;
        for (int i = 0 ; i < 1000000 ; i++ ){
            coin = (int)(Math.random() * 2 );
            if (coin == 1 )
                tailsCount++;
            else
                headsCount++;
        }
        System.out.println(tailsCount+ "  times tail " + headsCount + "  times heads");
    }
}
