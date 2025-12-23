//MAIN GAME

import java.util.*;
import java.io.*;

public class popbal {
    static Scanner input = new Scanner(System.in);
    player gamer;

    // GAME START
    public static void main(String[] args) {
        popbal game = new popbal();

        // map mapa = new map(20);
        // mapa.printMap();

        game.gameStartUi();
        game.playerSetup();
        game.startFightSequence();
        game.startFightSequence();

        input.close();

    }

    // GAME START UI
    public void gameStartUi() {
        System.out.println("// welcome to " + rng.gameNameGenerator() + " //");
        System.out.println("Type 1 to start");
        String startinput = input.nextLine();
        if (!startinput.equals("1")) {
            System.out.println("bruh ok bye");
            System.exit(0);
        } else
            System.out.println("we startin'");
    }

    // PLAYER SETUP
    public void playerSetup() {
        System.out.println();
        System.out.println("yo whats ur name og");
        String playername = input.nextLine();
        this.gamer = new player(playername, 20);
        System.out.println();
        System.out.println("aight " + gamer.getPlayer_name() + " let's get it");
    }

    // FIGHT SEQUENCE
    public void startFightSequence() {
        System.out.println();
        // checking if player is dead before starting fight
        if (gamer.isplayerdead() == true) {
            System.out.println("you dead bro, cant start fight sequence");
            return;
        }

        // enemy generation
        boolean endgame = true;
        enemy zloun = new enemy();
        System.out.println("in front of you is " + zloun.name + " with " + zloun.enemy_hp + " hp tryna beat yo shi");
        System.out.println("// available actions: help, punch, call mom, call dad, run, yell, upgrade punch //");

        // fight loop
        while (endgame && !gamer.isplayerdead()) {
            // player action input
            System.out.println();
            System.out.println("// what do you do //");
            String odpoved = input.nextLine();
            action ok = new action(odpoved, zloun);

            // action handling
            if (ok.udelej() == "punch" || ok.udelej() == "upgraded punch") {
                System.out.println();
                System.out.println("bro ma rn " + zloun.enemy_hp);
                zloun.gethit(ok.damagedealt);
                System.out.println("uderils mu " + ok.damagedealt);
                System.out.println("tedka ma " + zloun.enemy_hp);
                System.out.println();

                if (zloun.isbrodead() == true) {
                    System.out.println("you killed " + zloun.name);
                    endgame = false;
                } else {
                    int damagefromenemy = rng.randomcislo(5);
                    gamer.getHit(damagefromenemy);
                    System.out.println(zloun.getName() + " just hit your ass for " + damagefromenemy + ", you now have "
                            + gamer.getPlayer_hp() + " hp\n");
                    if (gamer.isplayerdead()) {
                        System.out.println("you dead bro");
                        return;
                    }
                }
            } else System.out.println(ok.udelej());
        }
    }
}