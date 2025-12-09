package homer;

import java.util.Random;

public class action {

    String odpoved;
    Random random = new Random();
    enemy zloun;

    public action(String odpoved, enemy zloun) {
        this.odpoved = odpoved;
        this.zloun = zloun;
    };

    public String udelej() {
        switch (odpoved) {
            case "help":
                return "tady neni zadna pomoc bro";
            case "punch":
                int random_hit = random.nextInt(5);
                zloun.gethit(random_hit);
                return "";
                

            default:
                return "nevim co chces";

        }
    }

}
