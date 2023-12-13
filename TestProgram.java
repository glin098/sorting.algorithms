//package sorting.algorithms;

public class TestProgram {

	public static String vectorToString(String name, int[] vector) {
	    String s = name + " {";

	    for (int i=0; i < vector.length; i++)
	        s = s + vector[i] + ((i < vector.length - 1) ? ", " : "");

	    s = s + "}";

	    return s;
	}

	public static void initializeRandomData(int[] vector) {
		for (int i=0; i < vector.length; i++)
			vector[i] = (int) (100 * Math.random());
	}

	public static void test(int n) {
		int[] data, random = new int[n];

		initializeRandomData(random);
		
		System.out.println(vectorToString("\nData             ", random) + "\n");

		// --------------------------------------------------------------------------------------
		// Bubble sort
		// --------------------------------------------------------------------------------------
		
		ISort bubbleSort = new BubbleSort();
		
		data = random.clone();
		bubbleSort.sort(data);
		
		System.out.println(vectorToString("Bubble sort      ", data));

        // --------------------------------------------------------------------------------------
		// Selection sort
		// --------------------------------------------------------------------------------------
		
        ISort SelectionSort = new SelectionSort();

		data = random.clone();
        SelectionSort.sort(data);

        System.out.println(vectorToString("Selection sort      ", data));

		// --------------------------------------------------------------------------------------
		// Insertion sort
		// --------------------------------------------------------------------------------------
		
        ISort InsertionSort = new InsertionSort();

		data = random.clone();
        SelectionSort.sort(data);

        System.out.println(vectorToString("Insertion sort      ", data));

		// --------------------------------------------------------------------------------------
		// Heap sort
		// --------------------------------------------------------------------------------------
		
        ISort HeapSort = new HeapSort();

		data = random.clone();
        HeapSort.sort(data);

        System.out.println(vectorToString("Heap sort      ", data));

		// --------------------------------------------------------------------------------------
		// Merge sort
		// --------------------------------------------------------------------------------------
		
        ISort MergeSort = new MergeSort();

		data = random.clone();
        MergeSort.sort(data);

        System.out.println(vectorToString("Merge sort      ", data));

		// --------------------------------------------------------------------------------------
		// Lomuto's Quick sort
		// --------------------------------------------------------------------------------------
		
        ISort LomutosQuickSort = new LomutosQuickSort();

		data = random.clone();
        LomutosQuickSort.sort(data);

        System.out.println(vectorToString("Lomuto's Quick sort      ", data));

		// --------------------------------------------------------------------------------------
		// Hoare's Quick sort
		// --------------------------------------------------------------------------------------
		
        ISort HoareQuickSort = new HoareQuickSort();

		data = random.clone();
        HoareQuickSort.sort(data);

        System.out.println(vectorToString("Hoare's Quick sort      ", data));
    }

	public static void main(String[] args) {
		test(15);
	}	
}