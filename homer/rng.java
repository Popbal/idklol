

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class rng {
    static Random random = new Random();

    // RANDOM NUMBER GENERATOR
    public static int randomcislo(int numero) {
        return random.nextInt(numero + 1);
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

    // ENEMY NAME GENERATOR
    public static String nameGen() {
        try (BufferedReader br = new BufferedReader(new FileReader("idklol/names/zlounNames.txt"))){
            String everything = br.readAllAsString().replaceAll("\r\n", "").replace("ENEMY NAMES - Follow the \";\" rule","");
            String[] names = everything.split(";");
            int randomIndex = rng.randomcislo(names.length-1);
            return names[randomIndex];
        } catch (IOException e){
            return "something went wrong with zlounNames.txt twin";
        }
    }
}
