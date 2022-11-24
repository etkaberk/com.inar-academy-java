package chapters.Chapter12.Exercises12.Exercise12_01;

public class Exercise12_01_WithException {
    public static void main(String[] args) throws NumberFormatException {
        if (args.length != 3) {
            System.out.println(
                    "Usage: java Calculator operand1 / operator / operand2");
            System.exit(0);
        }


        int result = 0;


        try {

            switch (args[1].charAt(0)) {
                case '+' : result = Integer.parseInt(args[0]) +
                        Integer.parseInt(args[2]);
                    break;
                case '-' : result = Integer.parseInt(args[0]) -
                        Integer.parseInt(args[2]);
                    break;
                case '.' : result = Integer.parseInt(args[0]) *
                        Integer.parseInt(args[2]);
                    break;
                case '/' : result = Integer.parseInt(args[0]) /
                        Integer.parseInt(args[2]);
                    break;
            }

                    System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
                    + " = " + result);
        }
        catch (NumberFormatException ex) {
            System.err.println("Wrong Input !!!");
            System.exit(0);

        }
    }
}
