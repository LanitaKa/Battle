import java.util.Scanner;
import java.util.Random;

public class Hero {
    private  String name;
    private  int hp;
    private int damage;
    private String[] skills ;

    public Hero(String name, int hp, int damage, String[] skills) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.skills = skills;
    }

    public String getRandomSkill() {
        Random random = new Random();
        int index = random.nextInt(this.skills.length);

        return  this.skills[index];
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setHP(int newHP) {
        this.hp = newHP;
    }
}


