import java.util.Date;

public class RiskyExample2 {

    /**
     *
     * @return the first day of spring this year
     */
    public static Date startOfSpring() {
        if (groundhogAnswer == null)
            groundhogAnswer = askGroundhog();
        return new Date(groundhogAnswer.getTime());
    }

    /**
     * somewhere else in the code
     */
    public static void partyPlanning() {
        // let's have a party one month after spring starts!
        Date partyDate = startOfSpring();
        partyDate.setMonth(partyDate.getMonth()+1);
        System.out.println("Date of party is: " + partyDate);
    }

    private static Date groundhogAnswer = null;

    public static Date askGroundhog() {
        Date groundHogPredition = new Date(118, 02, 20);
        return groundHogPredition;
}

    public static void main(String[] args) {
        System.out.println("Start of spring is: " + startOfSpring());
        partyPlanning();
    }
}
