import java.util.Scanner;
import java.util.Random;

public class Hero {
    private  String name;
    private  int hp;
    private int damage;
    private String skill;
    String[] skills;

    public Hero(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        skills = new String[]{"lightning", "fireball", "Slash", "Thunderball"};
    }

    public Hero(String name, int lvl) {
       this.name = name;
        skills = new String[]{"lightning", "fireball", "Slash", "Thunderball"};
        initLevel(lvl);
    }


    private void initLevel (int lvl) {
        Random random = new Random();
        switch (lvl) {
            case 1: {
                hp = random.nextInt(20) + 60;
                damage = random.nextInt(2) + 6;
                break;
            }
            case 2: {
                hp = random.nextInt(20) + 90;
                damage = random.nextInt(5) + 10;
                break;
            }
            case 3: {
                hp = random.nextInt(20) + 120;
                damage = random.nextInt(5) + 15;
                break;
            }
        }

    }


    public void setRandomSkill() {
        Random randomSkills = new Random();
        int randomSkillsIndex = randomSkills.nextInt(this.skills.length);
        skill = this.skills[randomSkillsIndex];
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

    public String getSkill(){
        return skill;
    }

    public void setHP(int newHP) {
        this.hp = newHP;
    }
}


