import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
            //задача первая//
        int[] wholeNumbers = new int[3];
        wholeNumbers[0] = 1;
        wholeNumbers[1] = 2;
        wholeNumbers[2] = 3;
        System.out.println(wholeNumbers[1]);
        double[] fractionalNumbers = {1.57, 7.654, 9.986};
        System.out.println(fractionalNumbers[1]);
        String[] words = {"one", "two", "three" };
        System.out.println(words[1]);
        //задача вторая//
        for (int i = 0; i < wholeNumbers.length; i++) {
            System.out.print(wholeNumbers[i]);
            if (i != wholeNumbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < fractionalNumbers.length; i++) {
            System.out.print(fractionalNumbers[i]);
            if (i != fractionalNumbers.length - 1) {
                System.out.print(", ");
                }
            }
        System.out.println();
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]);
            if (i != words.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //задача третья//
        for (int i = wholeNumbers.length - 1; i >= 0 ; i--) {
            System.out.print(wholeNumbers[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = fractionalNumbers.length - 1; i >= 0 ; i--) {
            System.out.print(fractionalNumbers[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = words.length - 1; i >= 0 ; i--) {
            System.out.print(words[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        //задача четвертая//
        System.out.println();
        for (int i = 0; i < wholeNumbers.length; i++) {
            if (wholeNumbers[i] % 2!=0) {
                wholeNumbers[i] += 1;
            }
        }
        System.out.println(Arrays.toString(wholeNumbers));
    }
}