class Enemy {
    constructor() {
        this.enemy_hp = 5;
    }

    gethit(dmg) {
        console.log("bro ma rn " + this.enemy_hp);
        this.enemy_hp = this.enemy_hp - dmg;
        console.log("uderils mu " + dmg);
        console.log("tedka ma " + this.enemy_hp);
    }

    isbrodead() {
        if (this.enemy_hp <= 0) {
            console.log(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSqvfqKLfBUm-ywYcJe8IwFa7KX4JsXCviiKw&s"
            );
            return true;
        } else {
            return false;
        }
    }
}

class Action {
    constructor(odpoved, zloun) {
        this.odpoved = odpoved;
        this.zloun = zloun;
    }

    udelej() {
        switch (this.odpoved) {
            case "help":
                return "tady neni zadna pomoc bro";
            case "punch":
                const random_hit = Math.floor(Math.random() * 5);
                this.zloun.gethit(random_hit);
                return "";
            default:
                return "nevim co chces";
        }
    }
}

const readline = require("readline").createInterface({
    input: process.stdin,
    output: process.stdout,
});

console.log("in front of you is a evil ass man tryna beat yo shi");

const zloun = new Enemy();

function gameLoop() {
    readline.question("// what do you do //\n", (odpoved) => {
        const ok = new Action(odpoved, zloun);
        console.log(ok.udelej() + "\n");
        if (zloun.isbrodead()) {
            console.log("zabils blbce");
            readline.close();
        } else {
            gameLoop();
        }
    });
}

gameLoop();