import java.util.Date;

public class RiskyExample2 {

    /**
     *
     * @return the first day of spring this year
     */
    public static Date startOfSpring() {
        if (groundhogAnswer == null)
            groundhogAnswer = askGroundhog();
        return groundhogAnswer;
    }

    /**
     * somewhere else in the code
     */
    public static void partyPlanning() {
        // let's have a party one month after spring starts!
        Date partyDate = startOfSpring();
        partyDate.setMonth(partyDate.getMonth()+1);
    }

    private static Date groundhogAnswer = null;

    public static Date askGroundhog() {
        Date groundHogPredition = new Date(2018, 03, 20);
        return groundHogPredition;
    }

    public static void main(String[] args) {
        partyPlanning();
        System.out.println(startOfSpring());

    }
}
