package HW2;

/**
 * Пирамидальная сортировка
 */
public class HeapSort {
    public static void main(String[] args) {
        int [] arr = new int[] {1, 3 ,5,9,2,4,6,8,15,12};
       sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);

        }

    }
    public static void sort(int [] arr){
        /**
         * Построение кучи(перегруппируем массив)
         */
        for (int i = arr.length / 2-1; i >= 0; i--)
            heapify(arr, arr.length, i);
        /**
         * Один за другим извлекаем элементы из кучи
         */
        for (int i = arr.length - 1; i >= 0; i--) {
            /**
             * Перемещаем текущий корень в конец
             */
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            /**
             * Вызываем процедуру heapify на уменьшенной куче
             */
            heapify(arr, i, 0);
        }

    }
    private static void heapify (int[] arr, int heapSize, int rootIndex){
        int largest = rootIndex;  /* инициализируем наибольший элемент, как корень*/
        int leftChild = 2 * rootIndex + 1;  /* левый*/
        int rightChild = 2 * rootIndex + 2;  /* правый*/
        /**
         * Если левый дочерний элемент больше корня
         */
        if (leftChild < heapSize && arr[leftChild] > arr[largest])
            largest = leftChild;
        /**
         * Если правый дочерний элемент больше, чем самый большой элемент
         */
        if (rightChild<heapSize && arr[rightChild] > arr[largest])
            largest = rightChild;
        /**
         * Если самый большой элемент не корень
         */
        if (largest != rootIndex){
            int temp = arr[rootIndex];
            arr[rootIndex] = arr[largest];
            arr[largest] = temp;
            /**
             * Рекурсивно преобразуем в двоичную кучу затронутое поддерево
             */
            heapify(arr, heapSize, largest);
        }
    }
}
