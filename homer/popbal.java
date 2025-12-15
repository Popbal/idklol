//MAIN GAME

import java.util.*;
import java.io.*;

public class popbal {
    static Scanner input = new Scanner(System.in);
    boolean endgame = true;

    // GAME START
    public static void main(String[] args) {
        popbal game = new popbal();
        game.gameStartUi();
        game.playerSetup();
        game.startFightSequence();

    }

    // GAME START UI
    public void gameStartUi() {
        System.out.println("// welcome to " + gameNameGenerator() + " //");
        System.out.println("Type 1 to start");
        String startinput = input.nextLine();
        if (!startinput.equals("1")) {
            System.out.println("bruh ok bye");
            System.exit(0);
        } else
            System.out.println("we startin'");
        System.out.println();
    }

    // PLAYER SETUP
    public void playerSetup() {
        System.out.println("yo whats ur name og");
        String playername = input.nextLine();
        System.out.println("aight " + playername + " let's get it");
        System.out.println();
    }

    // FIGHT SEQUENCE - make fight sequence repeatable for multiple enemies
    public void startFightSequence() {
        enemy zloun = new enemy();
        System.out.println("in front of you is " + zloun.name + " with " + zloun.enemy_hp + " hp tryna beat yo shi");
        System.out.println("// available actions: help, punch, call mom, call dad, run, yell, upgrade punch //");

        while (endgame) {
            System.out.println("// what do you do //");
            String odpoved = input.nextLine();
            action ok = new action(odpoved, zloun);
            System.out.println(ok.udelej() + "\n");
            if (zloun.isbrodead() == true) {
                System.out.println("you killed " + zloun.name);
                endgame = false;
            }
        }
        input.close();
    }

    // GAME NAME GENERATOR
    public static String gameNameGenerator() {
        try (BufferedReader br = new BufferedReader(new FileReader("idklol/names/gameNames.txt"))) {
            String everything = br.readAllAsString().replaceAll("\r\n", "").replace("GAME NAMES - Follow the \";\" rule","");
            String[] gameNames = everything.split(";");
            int randomIndex = rng.randomcislo(gameNames.length-1);
            return gameNames[randomIndex];
        } catch (IOException e) {
            return "something went wrong with gameNames.txt twin";
        }
    }
}