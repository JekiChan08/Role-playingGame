package plot.endings;

import Characters.Enemies;
import Characters.MainHero;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

//подземелье
public class Dungeon {
    //уровень
    private int level;

    private ArrayList<Enemies> enemies;


    public int choiceDungeon() {
        System.out.println("Выберите что хитоте сделать:\n" +
                "1) Пойти сражаться\n" +
                "2) Проверить свои статы\n" +
                "любое) Выйти с подземелья");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice <= 2) {
            return choice;
        }else System.out.println("Такого выбора нету");
        return 3;
    }


    public void start(MainHero mainHero) {
        System.out.println("Вы вошли в подземелье");
        System.out.println("уровень подземелья: " + level);
        boolean endWhile = true;
        while (endWhile) {
            try {
                switch (choiceDungeon()) {
                    case 1: {
                        battle(mainHero);
                        break;
                    }
                    case 2: {
                        mainHero.getStats();
                    }
                    default: {
                        endWhile = false;
                        break;
                    }
                }
                if (mainHero.getHealth() <= 0) {
                    endWhile = false;
                }
            }catch (InputMismatchException e) {
                System.out.println("Нельзя писать что то другое кроме целочисленных цифер");
            }
        }
    }
    public void battle(MainHero mainHero) {
        boolean endWhile = true;
        double health;
        double damage;
        if (level >= 1) {
            damage = 10 * level;
            health = 20 * level;
        }else {
            damage = 7;
            health = 17;
        }

        while (endWhile) {


            Random rn = new Random();
            Enemies enRn = enemies.get(rn.nextInt(0, enemies.size()));

            System.out.println("Вы встретили монстра: " + enRn.getName());
            System.out.println("Если вы удрите " + enRn.getName() + " то он начнёт атаковать");
            System.out.println("Ваши действия?\n" +
                    "1) Ударить - ваш урон: " + mainHero.getDamage() + "\n" +
                    "   Ваше здоровье: " + mainHero.getHealth() + "\n" +
                    "   Урон врага: " + damage + "\n" +
                    "   HP врага: " + health + "\n"+
                    "2) выйти с подземелья");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1 : {
                    health -= mainHero.getDamage();
                    if (health <= 0 ) {
                        System.out.println("Вы убили " + enRn.getName() + "!");
                        level += 1;
                        mainHero.setMoney(mainHero.getMoney() + enRn.getMany());
                        System.out.println("Вы получили деньги в сумме: " + enRn.getMany());
                        endWhile = false;
                        break;
                    } else {
                        mainHero.setHealth(mainHero.getHealth() - damage);
                        break;
                    }
                } default: {
                    System.out.println("Вы вышли с подземелья");
                    endWhile = false;
                    break;
                }
            }
            if (mainHero.getHealth() <= 0) {
                endWhile = false;
            }
        }
    }


    public Dungeon() {
        this.level = 0;
        enemies = new ArrayList<>();
        enemies.add(Enemies.SKELETON);
        enemies.add(Enemies.SPIDER);
        enemies.add(Enemies.GOBLIN);
        enemies.add(Enemies.GIANT);
        enemies.add(Enemies.VAMPIRE);
        enemies.add(Enemies.ZOMBIE);
        enemies.add(Enemies.BASILISK);
        enemies.add(Enemies.COBALT);
        enemies.add(Enemies.CYCLOPS);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
