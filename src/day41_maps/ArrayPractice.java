package day41_maps;

import java.util.*;

public class ArrayPractice {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(6, 7, 8, 9));

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10, 11, 12, 13, 14));


        List<Integer> [] arrayOfLists=new List[5];

        arrayOfLists[0] = list1;
        arrayOfLists[1] = list2;
        arrayOfLists[2] = list3;

        System.out.println(Arrays.toString(arrayOfLists));



        System.out.println(Arrays.toString(arrayOfLists));


        Set<Integer>[] arrayOfSets = new Set[5];

        arrayOfSets[0] = new LinkedHashSet<>();
        arrayOfSets[1] = new LinkedHashSet<>();
        arrayOfSets[2] = new LinkedHashSet<>();
        arrayOfSets[3] = new LinkedHashSet<>();
        arrayOfSets[4] = new LinkedHashSet<>();

        System.out.println(Arrays.toString(arrayOfSets));

        arrayOfSets[2].addAll(Arrays.asList(1, 2, 3, 4));

        System.out.println(Arrays.toString(arrayOfSets));

    }
}
