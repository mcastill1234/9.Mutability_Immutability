import java.util.*;

public class RiskyExample1 {
    public static void main(String[] args) {

        List<Integer> myData = Arrays.asList(-5, -3, -2);
        System.out.println(sumAbsolute(myData));
        System.out.println(sum(myData));

    }

    /**
     *
     * @param list
     * @return the sum of the numbers in the list.
     */
    public static int sum(List<Integer> list) {
        int sum = 0;
        for (int x : list)
            sum += x;
        return sum;

    }

    /**
     *
     * @param list
     * @return the sum of the absolute values of the numbers in the list
     */
    public static int sumAbsolute(List<Integer> list) {
        // let' reuse sum(), because DRY, so first we take absolute values
        for (int i = 0; i < list.size(); ++i)
            list.set(i,  Math.abs(list.get(i)));
        return sum(list);
    }
}
