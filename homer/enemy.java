package homer;

public class enemy {
    int enemy_hp = 5;
    String name = nameGen();

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
    public String nameGen() {
        String[] names = {"debil","kokot","hujer","blbec","mrdka","pako","hovado","blb","idiot","cvok","fag","idiot","loser","dummy","moron","nincompoop","dunce","simpleton","blockhead","bonehead","dimwit","dullard","airhead","birdbrain","clod","cretin","dope","dunderhead","halfwit","nitwit","numskull","pinhead","twit"};
        int randomIndex = (int) (Math.random() * names.length);
        return names[randomIndex];
    }
    public String toString() {
        return name;
    }
}