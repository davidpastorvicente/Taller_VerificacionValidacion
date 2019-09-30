public class BubbleSort {
    /**
     * This method the BubbleSort method. Returns
     * the array in increasing order.
     *
     * @param array The array to be sorted
     * @param size  The count of total number of elements in array
     **/
    public static <T extends Comparable<T>> void BS(T[] array, int size) {
        boolean swap;
        int last = size - 1;
        do {
            swap = false;
            for (int count = 0; count <= last - 1; count++) {
                int comp = array[count].compareTo(array[count + 1]);
                if (comp > 0) {
                    T temp = array[count];
                    array[count] = array[count + 1];
                    array[count + 1] = temp;
                    swap = true;
                }
            }
        } while (swap);
    }

    public static <T extends Comparable<T>> void main(String args[]) {
        String[] aux= {"8","7","6","5","4","9"};
        BS(aux, aux.length);
        for(int i=0; i<aux.length; i++)
            System.out.print(aux[i]);
    }
}