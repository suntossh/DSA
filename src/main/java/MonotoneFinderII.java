import java.util.Arrays;

public class MonotoneFinderII {

    public static void main(String[] args) {
        System.out.println("Hari Bol");
        int[] arrayOfInt = {1, 1, 1, 1, 1};

        Arrays.stream(arrayOfInt).forEach(i -> System.out.print(i + " "));
        System.out.println("Hari");

        int first = arrayOfInt[0];
        int last = arrayOfInt[arrayOfInt.length - 1];
        String finallyItIs = "monotonic";

        for (int i = 0; i < arrayOfInt.length - 1; i++) {
            if (first < last) {
                if (arrayOfInt[i + 1] < arrayOfInt[i]) {
                    finallyItIs = "It is not monotonic";
                    break;
                }
            } else if (first > last) {
                if (arrayOfInt[i + 1] > arrayOfInt[i]) {
                    finallyItIs = "It is not monotonic";
                    break;
                }
            } else if (first == last) {
                if (arrayOfInt[i + 1] != arrayOfInt[i]) {
                    finallyItIs = "It is not monotonic";
                    break;
                }
            }
        }

        System.out.println("->" + finallyItIs);
    }
}
