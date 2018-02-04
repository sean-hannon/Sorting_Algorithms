public class Main {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
//        int[] input = {54,12,35};
        int[] input = {24,2,45,20,56,75,2,56,99,53,12};
        int[] quickSorted = quickSort.sort(input);
        System.out.println("Quick Sort");
        for (int i = 0; i < quickSorted.length; i++) {
            System.out.println(quickSorted[i]);
        }
        System.out.println("Bubble Sort");
        BubbleSort bubbleSort = new BubbleSort();
        int[] bubbleSorted = bubbleSort.sort(input);
        for (int i = 0; i < bubbleSorted.length; i++) {
            System.out.println(bubbleSorted[i]);
        }
        System.out.println("Selection Sort");
        SelectionSort selectionSort = new SelectionSort();
        int[] selectionSorted = selectionSort.sort(input);
        for (int i = 0; i < selectionSorted.length; i++) {
            System.out.println(selectionSorted[i]);
        }
    }
}
