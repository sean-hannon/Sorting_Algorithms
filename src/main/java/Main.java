import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
//        int[] input = {54,12,35};
        int[] input = {24,2,45,20,56,75,2,56,99,53,12};
        System.out.println("Inuput Array");
        System.out.println(Arrays.toString(input));
        int[] quickSorted = quickSort.sort(input);
        System.out.println("Quick Sort");
        System.out.println(Arrays.toString(quickSorted));

        System.out.println("Bubble Sort");
        BubbleSort bubbleSort = new BubbleSort();
        int[] bubbleSorted = bubbleSort.sort(input);
        System.out.println(Arrays.toString(bubbleSorted));

        System.out.println("Selection Sort");
        SelectionSort selectionSort = new SelectionSort();
        int[] selectionSorted = selectionSort.sort(input);
        System.out.println(Arrays.toString(selectionSorted));
    }
}
