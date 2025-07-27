package com;

import com.Objects.Date;
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


// TODO
    public static Person[] sortPeopleArray (Person[] arr) {
        return arr;
    }


    /**
     * This method takes an ArrayList and sorts the "Person"-objects in it descending by their date of birth. If dates are equal,
     * object are sorted ascended by their last names. For the sorting Comparator is used.
     * compare(): p1 < p2 => -1 (p1 should appear first)
     *            p1 > p2 => 1 (p1 should appear second)
     *            p1 == p2 => 0
     */
    public static void sortPeopleList (ArrayList<Person> list) {

        list.sort(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                int yearCompare = Integer.compare(p2.getBirthDate().getYear(), p1.getBirthDate().getYear());
                if (yearCompare != 0) {
                    return yearCompare;
                }
                return p1.getLastName().compareTo(p2.getLastName());
            }
        });
    }

    /**
     * Optimized version of sortPeopleList using lambda
     */
    public static void sortPeopleListOptimized(ArrayList<Person> list) {
        list.sort(
                Comparator.comparing((Person p) -> p.getBirthDate().getYear()).reversed()
                        .thenComparing(Person::getLastName)
        );
    }


    /**
     * This method removes even numbers from ArrayList. The list is traversed from the end, bcs otherwise there is a risk of skipping
     * elements!!
     */
    public static void removeEvenNumbers (ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                list.remove(i);
            }
        }
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


        //Test sortPeopleList
        ArrayList<Person> peopleList = new ArrayList<>();

        peopleList.add(new Person("Tom", "Hall", new Date(11, 12, 1999)));
        peopleList.add(new Person("Marry", "Sue", new Date(3, 3, 2005)));
        peopleList.add(new Person("Mildred", "Miller", new Date(8, 1, 1998)));
        peopleList.add(new Person("David", "Loom", new Date(7, 4, 1948)));
        peopleList.add(new Person("Tom", "Mall", new Date(11, 12, 1999)));

        sortPeopleList(peopleList);

        for (Person p : peopleList) {
            System.out.println(p.getFullInfo());
        }

        sortPeopleListOptimized(peopleList);

        for (Person p : peopleList) {
            System.out.println(p.getFullInfo());
        }


        //Test removeEvenNumbers()
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        removeEvenNumbers(numbers);
        for (int i = 0; i < numbers.size() - 1; i++) {
            System.out.println(numbers.get(i));
        }



    }
}
