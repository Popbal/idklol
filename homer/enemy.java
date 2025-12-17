
import java.io.*;

public class enemy {
    int enemy_hp;
    String name = rng.nameGen();

    public enemy() {
        this.enemy_hp = rng.randomcislo(11) + 4;
    }

    public void gethit(int dmg) {
        System.out.println("bro ma rn " + enemy_hp);
        enemy_hp = enemy_hp - dmg;
        System.out.println("uderils mu " + dmg);
        System.out.println("tedka ma " + enemy_hp);
    }

    public boolean isbrodead() {
        if (enemy_hp <= 0) {
            System.out.println(
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSqvfqKLfBUm-ywYcJe8IwFa7KX4JsXCviiKw&s");
            return true;
        } else
            return false;

    }

    public String getName() {
        return name;
    }
}