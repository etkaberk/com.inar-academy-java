package chapters.Chapter10.Checkpoints10;

public class Checkpoint10_08 {
    public static void main(String[] args) {
        Integer i = new Integer("23");//can
        Integer a = new Integer(23);//can
        Integer b = Integer.valueOf("23");//can
        Integer c = Integer.parseInt("23",8);//can
       // Double v = new Double();
        Double f = Double.valueOf("23.45");//can
        int y = (Integer.valueOf("23")).intValue();//can
        double m = (Double.valueOf("23.45")).doubleValue();//can
        int p = (Double.valueOf("23.4")).intValue();//can
        String s = (Double.valueOf("23.4")).toString();//can
        // just double d can not compile

    }
}
