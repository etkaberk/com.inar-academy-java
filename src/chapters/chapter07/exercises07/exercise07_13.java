package chapters.chapter07.exercises07;

public class exercise07_13 {
    public static int getRandom(int... numbers) {
        int number = 0;
        boolean isInNumbers = true;

        while (isInNumbers) {
            isInNumbers = false;
            number = (int) (Math.random() * 53) + 1;

            for (int i = 0; i < numbers.length; i++) {

                if (number == numbers[i]) {
                    isInNumbers = true;
                    break;
                }
            }
            if (!isInNumbers) {
                break;
            }

        }
        return number;
    }
}