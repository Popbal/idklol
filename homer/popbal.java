package homer;

import java.util.Scanner;

public class popbal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean endgame = true;
        enemy zloun = new enemy();
        System.out.println("welcome to homer simulator 2024");
        System.out.println("in front of you is "+ zloun.name + " tryna beat yo shi");

        

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
        System.out.println("you killed "+ zloun.name);
    }
}