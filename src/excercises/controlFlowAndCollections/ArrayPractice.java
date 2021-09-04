package excercises.controlFlowAndCollections;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        //1
        int[] arr = {1, 1, 2, 3, 5};
        //2
        for (int values : arr) {
            System.out.println(values);
        }
        //3
        String s = "I would not, could not, in a box. I would not, " +
                "could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse";
        String[] newString = s.split(" ");
        //4
        System.out.println(Arrays.toString(newString));

        //5
        String[] sentence = s.split("\\.");
        System.out.println(Arrays.toString(sentence));
    }

}
