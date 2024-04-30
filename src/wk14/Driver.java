package wk14;

public class Driver {
    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap();
        final int size = 50;
        for (int i = 0; i < size; i++) {
            heap.add((int) (Math.random() * size));
        }
        while (!heap.isEmpty()) {
            System.out.print(heap.extractMax() + " ");
        }
    }
}
