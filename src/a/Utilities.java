package a;

public class Utilities {

    public <T> void printArray(T[] array) {
        System.out.print("Array content: ");
        for (T t: array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public void printArray(int[] array) {
        System.out.print("Array content: ");
        for (int t: array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
}
