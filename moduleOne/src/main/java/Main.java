public class Main {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 10, 20, 25};

        System.out.println(BinarySearch.findElement(array, 2, 0, array.length - 1));
    }
}
