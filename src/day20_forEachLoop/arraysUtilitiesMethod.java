package day20_forEachLoop;

import java.util.Arrays;

public class arraysUtilitiesMethod {
    public static void main(String[] args) {
        int[] score = {90, 79, 86, 98, 78};
        Arrays.sort(score);
        System.out.println(Arrays.toString(score));


        int[] a1 = {1, 2, 3, 5, 4};
        int[] a2 = {1, 2, 3, 4, 5};
        Arrays.sort(a1);
        Arrays.sort(a2);
        //boolean r1 = Arrays.equals(a1, a2);

        System.out.println("---------------------");

        System.out.println(Arrays.equals(a1, a2));//  return boolean


        System.out.println("-------------------");

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'A', 'C', 'B'};

        Arrays.sort(ch2);

        boolean result = Arrays.equals(ch1, ch2);
        System.out.println(result);


        System.out.println("--------------------");

        int[] nums = {100, 20, 987, 90, 0, 1999, 1000, 12};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("Minimum Number: " + nums[0]);

        System.out.println("Max number: " + nums[nums.length - 1]);

        System.out.println("--------------------------");

        char[] b1 = {'A', 'B', 'C'};
        char[] b2 = {'A', 'C', 'B'};

        Arrays.sort(b1);
        Arrays.sort(b2);
        System.out.println(Arrays.equals(b1, b2));

        System.out.println("---------------------");

        String[] students = {"Ali, Aziz", "Reza", "Yasin", "Hadi"};
        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("-----------------");

        int[] score1 = {30, 40, 50, 60, 70};
        int[] score2 = Arrays.copyOf(score1, 6);
        System.out.println(Arrays.toString(score2));

        System.out.println("------------------------");

        int[] n1 = {1, 2, 3, 4, 5, 6};
        int[] n2 = {7, 8, 9, 10};
        int[] n3 = Arrays.copyOf(n1, n1.length + n2.length);
        for (int i = 0, j = n1.length; i < 0; i++, j++) {
            n3[j] = n2[i];
        }
        System.out.println(Arrays.toString(n3));

        System.out.println("-----------------------------");
        char[] ch = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};

        char[] result2 = Arrays.copyOf(ch, 20);
        System.out.println(Arrays.toString(result2));

        char[] ch3= Arrays.copyOfRange(ch, 3, 6);
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(ch3));


    }
}
