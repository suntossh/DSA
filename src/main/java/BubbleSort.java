import java.util.Arrays;

public class BubbleSort {


    public void swap(int[] unsortedArray, int i) {
        int temp = unsortedArray[i];
        unsortedArray[i] = unsortedArray[i + 1];
        unsortedArray[i + 1] = temp;
    }

    public int[] sort(int[] unsortedArray) {
        boolean isSwapCalled = true;
        int counter = 0;// since every while loop iteration is causing largest number to be switched to extreme right
        // so we need not loop for no reason till end of array all time.
        while (isSwapCalled) {
            isSwapCalled = false;
            for (int i = 0; i < unsortedArray.length - 1 - counter; i++) {
                if (unsortedArray[i] > unsortedArray[i + 1]) {
                    swap(unsortedArray, i);
                    isSwapCalled = true;
                }
            }
            counter++;
        }
        return unsortedArray;
    }

    public static void main(String[] args) {
        int[] unsortedArray = {1, 4, 6, 2, 0, 9, -3};
        System.out.print("Unsorted Array [] --> ");
        Arrays.stream(unsortedArray).forEach(value -> System.out.print(value + " , "));

        BubbleSort bubbleSort = new BubbleSort();

        int[] sortedArray = bubbleSort.sort(unsortedArray);
        System.out.print("\n   Sorted Array[] --> ");
        Arrays.stream(sortedArray).forEach(value -> System.out.print(value + " , "));
    }
}
