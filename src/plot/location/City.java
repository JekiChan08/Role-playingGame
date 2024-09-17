package plot.location;

import Characters.MainHero;
import plot.Plot;
import plot.endings.Dungeon;

import java.util.Scanner;

//город
public class City{
    public City() {
    }

    public static void start(MainHero mainHero) {
        System.out.println("Добро пожаловать в Город! ");
        choiceCity(mainHero);

    }

    //список выборов в городе
    public static void choiceCity(MainHero mainHero) {
        Seller seller = new Seller();
        Dungeon dungeon = new Dungeon();

        boolean endWhile = true;
        while (endWhile) {
            System.out.println("Что вы хотите сделать?\n" +
                    "1) посмотреть свои статы\n" +
                    "2) пойти в подземелье\n" +
                    "3) купить оружие\n");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    mainHero.getStats();
                    break;
                }
                case 2: {
                    dungeon.start(mainHero);
                    break;
                }
                case 3: {
                    seller.buySword(mainHero);
                }
            }
        }
    }

}
