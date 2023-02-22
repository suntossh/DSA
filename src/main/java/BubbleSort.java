import java.util.Arrays;

public class BubbleSort {

    static int[] unsortedArray = {1, 4, 6, 2, 0, 9, -3};

    public static void swap(int i) {
        int temp = unsortedArray[i];
        unsortedArray[i] = unsortedArray[i + 1];
        unsortedArray[i + 1] = temp;
    }

    public static void main(String[] args) {
        Arrays.stream(unsortedArray).forEach(value -> System.out.print(value + " , "));
        boolean isSwapCalled = true;
        int counter = 0;// since every while loop iteration is causing largest number to be switched to extreme right
        // so we need not loop for no reason till end of array all time.
        while (isSwapCalled) {
            isSwapCalled = false;
            for (int i = 0; i < unsortedArray.length - 1 - counter; i++) {
                if (unsortedArray[i] > unsortedArray[i + 1]) {
                    swap(i);
                    isSwapCalled = true;
                }
            }
            counter++;
        }
        System.out.println("Sorted Array");
        Arrays.stream(unsortedArray).forEach(value -> System.out.print(value + " , "));
    }
}
