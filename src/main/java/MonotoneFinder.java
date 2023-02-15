import java.util.Arrays;

public class MonotoneFinder {

    public static void main(String[] args) {
        System.out.println("Hari Bol");
        int[] arrayOfInt = {1, 1};
        Arrays.stream(arrayOfInt).forEach(i -> System.out.print(i + " "));
        System.out.println("Hari");

        int monotoneI = 0;
        int monotoneD = 0;

        for (int i = 0; i < arrayOfInt.length - 1; i++) {

            // Increasing check
            if (arrayOfInt[i + 1] >= arrayOfInt[i]) {
                monotoneI++;
            }

            // Decreasing check
            if (arrayOfInt[i + 1] <= arrayOfInt[i]) {
                monotoneD++;
            }
        }

        boolean isMonotonic = monotoneI == (arrayOfInt.length - 1) || monotoneD == (arrayOfInt.length - 1) ? true : false;
        System.out.println("is arrayOfInt monotonic :" + isMonotonic);

    }
}
