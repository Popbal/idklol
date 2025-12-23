import java.util.*;

public class player {
    String player_name;
    int player_hp;

    public player(String player_name, int player_hp) {
        this.player_name = player_name;
        this.player_hp = player_hp;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public int getPlayer_hp() {
        return player_hp;
    }

    public boolean isplayerdead() {
        if (player_hp <= 0) {
            return true;
        } else
            return false;
    }

    public void getHit(int dmg) {
        player_hp = player_hp - (dmg + 1);
    }
}
