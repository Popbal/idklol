package homer;

import java.util.*;

public class popbal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean endgame = true;

        // GAME START UI
        System.out.println("welcome to " + gameNameGenerator());
        System.out.println("Type 1 to start");
        String startinput = input.nextLine();
        if (!startinput.equals("1")) {
            System.out.println("bruh ok bye");
            System.exit(0);
        }

        System.out.println("Enter name of your unfortunate player:");
        String playerName = input.nextLine();
        player player1 = new player(playerName);

        map testMap = new map(10, 5);
        testMap.createGeneratedMap();

        // ADD PLAYER SETUP HERE NAME N SHI

        // FIGHT SEQUENCE
        enemy zloun = new enemy(rng.randomcislo(10) + 10);
        System.out.println("in front of " + player1.getName() + " is " + zloun.enemy_name + " tryna beat their shi");
        System.out.println("his HP is " + zloun.enemy_hp + "\n");
        System.out.println("type 'actions' to see available actions\n");

        while (endgame) {
            System.out.println("// what do you do //");
            String odpoved = input.nextLine();
            action ok = new action(odpoved, zloun);
            System.out.println(ok.udelej() + "\n");
            if (zloun.isbrodead() == true) {
                endgame = false;
            }
        }
        input.close();
        System.out.println("you killed " + zloun.enemy_name);
    }

    // PERHAPS A DIFFERENT FILE LATER
    public static String gameNameGenerator() {
        String[] gamenames = { "Homer Simulator 2024", "Matescomp had it coming", "Balava's Revenge",
                "League of 9/11", "Fortnite: The second coming", "The best RPG of 2024", "Sex World Online",
                "No Future: For Everyone", "Deepwoken", "Mommy House vs Carlito: Gang Wars"
        };
        int randomIndex = (int) (Math.random() * gamenames.length);
        return gamenames[randomIndex];
    }
}