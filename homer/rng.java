package homer;

import java.util.Random;

public class rng {
    static Random random = new Random();

    public static int randomcislo(int numero) {
        return random.nextInt(numero + 1);
    }

}
