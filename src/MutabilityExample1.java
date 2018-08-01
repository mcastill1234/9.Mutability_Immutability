public class MutabilityExample1 {

    public static void main(String[] args) {

        String s = "a";
        s = s.concat("b");

        StringBuilder sb = new StringBuilder("a");
        sb.append("b");

        String t = s;
        t = t + "c";

        StringBuilder tb = sb;
        tb.append("c");


    }
}




