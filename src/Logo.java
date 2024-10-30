import java.util.Random;

public enum Logo {

    BMW, Mercedes, Ford, Porsche, Lexus;

    private static Random rnd = new Random();

    public static Logo getRandom() {
        return Logo.values()[rnd.nextInt(Logo.values().length)];
    }

}
