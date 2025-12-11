package homer;

import java.util.Random;

public class action {

    String odpoved;
    Random random = new Random();
    enemy zloun;
    boolean upgradedpunch = false;

    public action(String odpoved, enemy zloun) {
        this.odpoved = odpoved;
        this.zloun = zloun;
    };

    public String udelej() {
        switch (odpoved) {
            case "actions" :
                return "available actions: help, punch, call mom, call dad, run, yell, upgrade punch";
            case "help":
                return "tady neni zadna pomoc bro";
                
            case "punch":
                if (upgradedpunch) {
                    int random_hit_upgraded = rng.randomcislo(10);
                    zloun.gethit(random_hit_upgraded);
                    return "";
                }
                int random_hit = rng.randomcislo(5);
                zloun.gethit(random_hit);
                return "";

            case "call mom":
                return "mom is busy rn";

            case "call dad":
                return "dad went to buy some milk";
            case "run":
                return "you cant run from your problems";
            case "yell":
                return "you yell at the enemy but he aint scared";
            case "upgrade punch":
                int randomupgradechance = rng.randomcislo(1);
                if (randomupgradechance == 1) {
                    upgradedpunch = true;
                    return "your punch has been upgraded!";
                } else {
                    return "upgrade failed";
                }


            default:
                return "nevim co chces";

        }
    }

}
