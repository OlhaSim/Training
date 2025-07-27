package com;

import com.Objects.Person;
import java.util.*;

/**
 * This class is for simple tasks, which include operations with arrays and ArrayLists
 */
public class Tasks {


    public static void flipArray (int [] arr) {

        for (int i = 0; i < arr.length / 2; i++) {

            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;

        }
    }



    public static void flipList (List<Integer> list) {
        Collections.reverse(list);
    }



    public static int countUniqueWordsInText (String text) {

        // Replace all non-letter characters (like commas) with spaces
        text = text.replaceAll("[^a-zA-Zà-ÿÀ-ß']", " ");

        // Convert the entire text to lowercase
        text = text.toLowerCase(Locale.getDefault());

        // Split on one or more whitespace characters
        String[] arr = text.trim().split("\\s+");

        // The counted words are saved in an ArrayList
        ArrayList<String> list = new ArrayList<String>();

        int counter = 0;

        for (String s : arr) {
            if (!list.contains(s)) {
                list.add(s);
                counter++;
            }
        }

        return counter;
    }



    /**
    * This version of countUniqueWordsInText() uses Set for simplification
    */
    public static int improvedCountUniqueWordsInText(String text) {

        // Replace all non-letter characters with spaces
        text = text.replaceAll("[^a-zA-Zà-ÿÀ-ß]", " ");

        // Convert to lowercase
        text = text.toLowerCase(Locale.getDefault());

        // Split by any number of spaces. Trim() removes spaces at start and end
        String[] words = text.trim().split("\\s+");

        Set<String> uniqueWords = new HashSet<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                uniqueWords.add(word);
            }
        }

        return uniqueWords.size();
    }



    public static Person[] sortPeopleArray (Person[] arr) {
        return arr;
    }



    public static ArrayList<Person> sortPeopleList (ArrayList<Person> list) {
        return list;
    }



    /**
     * All methods and algorithms are tested in main() method
     */
    public static void main(String[] args) {
        // Test flipArray
        int[] arr = {1, 2, 3, 4};
        flipArray(arr);
        System.out.println(Arrays.toString(arr));

        // Test flipList
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        flipList(list);
        System.out.println(list);

        // Test countUniqueWordsInText and it's improved version
        String poem = "While I nodded, nearly napping, suddenly there came a tapping, " +
                      "as of some one gently rapping, rapping at my chamber door";
        System.out.println(countUniqueWordsInText(poem));
        System.out.println(improvedCountUniqueWordsInText(poem));

    }
}
