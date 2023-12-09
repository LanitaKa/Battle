import java.util.Scanner;
import java.util.Random;

public class Battle {
    private static Hero heroOne;
    private static Hero heroTwo;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Now , then heroes here we might start the battle !");

        System.out.println("What's the name of hero number one?");
        String nameHeroOne = scanner.next();

        System.out.println("What's the name of hero number two?");
        String nameHeroTwo = scanner.next();

        System.out.println("Hero 1 is " + nameHeroOne);
        System.out.println("Hero 2 is " + nameHeroTwo);

        Random random = new Random();
        int DMGHeroOne = random.nextInt(6) + 10;

        heroOne = new Hero(nameHeroOne, 100, DMGHeroOne);

        System.out.println("The HP for player 1 is: " + heroOne.getHP());
        System.out.println("The damage for player 1 is: " + heroOne.getDamage());
        System.out.println("Select your opponent's level:\n" +
                "1 - light, 2 - medium, 3 - high");
        int lvl = scanner.nextInt();

        heroTwo = new Hero(nameHeroTwo, lvl);

        System.out.println("The HP for player 2 is: " + heroTwo.getHP());
        System.out.println("The damage for player 2 is: " + heroTwo.getDamage());
        battleStart();

    }

    private static void battleStart() {
        while(heroOne.getHP() > 0 && heroTwo.getHP() > 0) {
            battleProcess();
        }
        if(heroOne.getHP() <= 0) {
                System.out.println(heroTwo.getName() + " has won the battle!");
            }else if (heroTwo.getHP() <= 0) {
                System.out.println(heroOne.getName() + " has won the battle!");
            }

    }

    private static void battleProcess() {
        heroOne.setRandomSkill();
        heroTwo.setRandomSkill();

        System.out.println("Here is our first hero: " + heroOne.getName() + " he used to apply his " + heroOne.getSkill() + " to damage " + heroOne.getDamage() + " points");
        System.out.println("Here is our first hero: " + heroTwo.getName() + " he used to apply his " + heroTwo.getSkill() + " to damage " + heroTwo.getDamage() + " points");

        int newHeroOneHpValue =  heroOne.getHP() - heroTwo.getDamage();
        int newHeroTwoHpValue =  heroTwo.getHP() - heroOne.getDamage();

        heroOne.setHP(newHeroOneHpValue);
        heroTwo.setHP(newHeroTwoHpValue);

        System.out.println("There is a new value of " + heroOne.getName() + " hp : " + heroOne.getHP() +  ". " + heroTwo.getName() + " damaged by his " + heroTwo.getSkill());
        System.out.println("There is a new value of " + heroTwo.getName() + " hp : " + heroTwo.getHP() +  ". " + heroOne.getName() + " damaged by his " + heroOne.getSkill());
    }
}

