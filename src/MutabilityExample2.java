import java.util.Arrays;
import java.util.List;

public class MutabilityExample2 {

    public static void main(String[] args) {
        List<Integer> myData = Arrays.asList(-5, -3, -2);
        System.out.println(sumAbsolute(myData));
        System.out.println(sum(myData));

    }

    public static int sum(List<Integer> list) {
        int sum = 0;
        for (int x : list)
            sum += x;
        return sum;
    }

    public static int sumAbsolute(List<Integer> list) {
        for (int i = 0; i < list.size(); ++i)
            list.set(i, Math.abs(list.get(i)));
        return sum(list);
    }
}





