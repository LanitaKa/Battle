import java.util.Scanner;

public class Battle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Hero john = new Hero("John" , 100 , 23 ,new String[] {"lightning" , "fireball"});
        Hero jim = new Hero("Jim" , 103 , 22 ,new String[] {"Slash" , "Thunderball"});

        String johnsName = john.getName();
        String jimsName = jim.getName();

        System.out.println("Now , then heroes here we might start the battle !");
        System.out.println(johnsName);
        System.out.println(jimsName);

        while(john.getHP() > 0 && jim.getHP() > 0) {
            String johnsSkill = john.getRandomSkill();
            int johnsDamage = john.getDamage();

            System.out.println("Here is our first character : " + johnsName + " he used to apply his " + johnsSkill + " to damage " + johnsDamage + " points");

            String jimSkill = jim.getRandomSkill();
            int jimDamage = jim.getDamage();

            System.out.println("Here is our first character : " + jimsName + " he used to apply his " + jimSkill + " to damage " + jimDamage + " points");

            int newJohnsHpValue =  john.getHP() - jimDamage;
            int newJimsHpValue = jim.getHP() - johnsDamage;
            jim.setHP(newJimsHpValue);
            john.setHP(newJohnsHpValue);

            System.out.println("There is a new value of John hp : " + newJohnsHpValue + ". Jim damaged by his " + johnsSkill);
            System.out.println("There is a new value of Jims hp : " + newJimsHpValue + ". Jim damaged by his " + jimSkill);

            if(john.getHP() <= 0) {
                System.out.println(jimsName + " has won the battle!");
            }else if (jim.getHP() <= 0) {
                System.out.println(johnsName + " has won the battle!");
            }
        }
    }
}
