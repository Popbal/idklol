package homer;

public class player {
    String player_name;
    int player_hp;
    int player_money;
    int player_level;
    int player_score; // LEADERBOARD FEATURE COULD BE FIRE

public player(String player_name) {
        this.player_name = player_name;
        this.player_hp = 50;
        this.player_money = 0;
        this.player_level = 1;
        this.player_score = 0;
    }
    public String getName() {
        return player_name;
    }
    public int getHp() {
        return player_hp;
    }
    public int getMoney() {
        return player_money;
    }
    public int getLevel() {
        return player_level;
    }

    
}
