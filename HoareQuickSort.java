public class HoareQuickSort extends Sort {
	
	private static int partition(int[] vector, int low, int high) {
        int pivot=vector[low]; 
        
        int p=low-1;
        int q=high+1;
 
        while (true) {
        	// find the leftmost element greater than or equal to pivot
        	
        	do {
        		p++;
        	} while (vector[p] < pivot);

        	// find the rightmost element smaller than or equal to pivot

        	do {
        		q--;
        	} while (vector[q] > pivot);
        	
        	if (p >= q)
        		return q;
        	
        	swap(vector, p, q);
        }
	}
		
	private static void sort(int[] vector, int low, int high) {
        if (low < high) {
            int p = partition(vector, low, high);
                       
            sort(vector, low, p);
            sort(vector, p+1, high);
        }
	}

	@Override
	public void sort(int[] vector) {
		sort(vector, 0, vector.length-1);
	}
	
}

