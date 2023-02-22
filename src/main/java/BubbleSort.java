import java.util.Arrays;

public class BubbleSort {

    static int[] unsortedArray = {1, 4, 6, 2, 0, 9, -3};

    public static void swap(int i) {
        int temp = unsortedArray[i];
        unsortedArray[i] = unsortedArray[i + 1];
        unsortedArray[i + 1] = temp;
    }

    public static void main(String[] args) {
        Arrays.stream(unsortedArray).forEach(value -> System.out.print(value+" , "));
        boolean isSwapCalled = true;
        while (isSwapCalled) {
            isSwapCalled = false;
            for (int i = 0; i < unsortedArray.length-1; i++) {
                if (unsortedArray[i] > unsortedArray[i + 1]) {
                    swap(i);
                    isSwapCalled = true;
                }
            }
        }
        System.out.println("Sorted Array");
        Arrays.stream(unsortedArray).forEach(value -> System.out.print(value+" , "));
    }
}
