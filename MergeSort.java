public class MergeSort extends Sort {
	
    private static void merge(int[] vector, int low, int mid, int high) {
        int [] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;

        // merge the left subarray with bounds [low, mid] and the right subarray with bounds [mid+1, high] 
        // by interleaving their items using a temporary array of size high - low + 1  
  
        while (i <= mid && j <= high) {
            if (vector[i] <= vector[j])
                temp[k++] = vector[i++];
            else
                temp[k++] = vector[j++];
        }
    
        while (i <= mid) {
            temp[k++] = vector[i++];
        }
    
        while (j <= high) {
            temp[k++] = vector[j++];
        }
    
        for (int l = 0; l < temp.length; l++) {
            vector[low + l] = temp[l];
        }

    }

    private static void mergeSort(int[] vector, int low, int high) {
        if (low < high) {
            int mid = (low + high) >> 1;  

            mergeSort(vector, low, mid);
            mergeSort(vector, mid + 1, high);

            merge(vector, low, mid, high);
        }
    }

    @Override
    public void sort(int[] vector) {
		mergeSort(vector, 0, vector.length-1);
	}
    
}
