package Class.Example;

public class Slime {
    double hp = 50;
    int attack = 8;
    double defense = 0.2;

    void setAttack (Slime enemy) {
        enemy.hp -= attack * (1 - enemy.defense);
    }
}
