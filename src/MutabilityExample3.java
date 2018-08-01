import java.util.Date;

public class MutabilityExample3 {

    public static Date groundhogAnswer = null;

    public static void main(String[] args) {

        Date partyDate = startOfSpring();
        partyDate.setMonth(partyDate.getMonth()+1);


    }

    public static Date startOfSpring() {
        if (groundhogAnswer == null)
            groundhogAnswer = askGroundhog();
        return groundhogAnswer;
    }



    public static Date askGroundhog() {
        return new Date(2018, 2, 2);
    }

}
