package chapters.Chapter12.Checkpoints12;

public class Checkpoint12_22 {
    public static boolean isNumeric(String token){
        try{
            Double.parseDouble(token);
            return true;
        }
        catch (java.lang.NumberFormatException ex){
            return false;
        }
    }
}
