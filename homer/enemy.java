package homer;

public class enemy {
    int enemy_hp = 5;

    public void gethit(int dmg) {
        System.out.println("bro ma rn" + enemy_hp);
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
}