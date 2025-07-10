import java.util.*;

/**
 * This class is for simple algorithms
 */
public class Algorithms {


    public static void flipList (int [] arr) {

        for (int i = 0; i < arr.length / 2; i++) {

            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;

        }
    }

    public static void easyFlipList (List<Integer> list) {
        Collections.reverse(list);
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        flipList(arr);
        System.out.println(Arrays.toString(arr));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        easyFlipList(list);
        System.out.println(list);

    }
}
