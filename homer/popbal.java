//MAIN GAME

import java.util.*;

public class popbal {
    static Scanner input = new Scanner(System.in);
    boolean endgame = true;

    public static void main(String[] args) {
        // START GAME
        popbal game = new popbal();
        game.gameStartUi();
        game.playerSetup();
        game.startFightSequence();

    }

    public void gameStartUi() {
        // GAME START UI
        System.out.println("welcome to " + gameNameGenerator());
        System.out.println("Type 1 to start");
        String startinput = input.nextLine();
        if (!startinput.equals("1")) {
            System.out.println("bruh ok bye");
            System.exit(0);
        } else
            System.out.println("we startin'");
        System.out.println();
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

    public void startFightSequence() {
        // FIGHT SEQUENCE
        enemy zloun = new enemy();
        System.out.println("in front of you is " + zloun.name + " tryna beat yo shi");

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
        System.out.println("you killed " + zloun.name);
    }

    public void playerSetup() {
        // PLAYER SETUP
        System.out.println("yo whats ur name og");
        String playername = input.nextLine();
        System.out.println("aight " + playername + " let's get it");
        System.out.println();
    }
}