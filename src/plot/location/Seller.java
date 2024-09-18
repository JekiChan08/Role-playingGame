package plot.location;

import Characters.MainHero;
import Characters.PersonClass;
import item.Items;
import item.Weapon;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//продавец
public class Seller {
    //мечи
    private ArrayList<Weapon> weapons = new ArrayList<>();
    private ArrayList<Items> items = new ArrayList<>();

    //список мечей
    public Seller() {
        weapons.add(Weapon.SWORD);
        weapons.add(Weapon.GREAMUAR);
        items.add(Items.SHIELD);
        items.add(Items.POLITION_LIFE);
    }
    //покупка предметов
    public void buySword(MainHero mainHero) {
        boolean endWhile = true;
        while (endWhile) {
            try {
                switch (choice(mainHero)) {
                    case 1: {
                        if (mainHero.getPersonClass().equals(PersonClass.WARRIOR)) {
                            double damageSword = mainHero.getDamage() * 1.8;
                            double price = mainHero.getWeapon().getPrice() * 1.4;

                            System.out.println("Полагаю воину нужен меч? Могу предложить вот этот меч со стоимостью " + price);
                            System.out.println("Меч с уроном: " + damageSword + "\n" +
                                    "1) Купить\n" +
                                    "2) Выйти с таверны\n");
                            int choice = new Scanner(System.in).nextInt();
                            switch (choice) {
                                case 1: {
                                    if (mainHero.getMoney() >= price) {
                                        mainHero.getWeapon().setDamage(damageSword);
                                        mainHero.getWeapon().setPrice(price);
                                        mainHero.setMoney(mainHero.getMoney() - price);
                                        System.out.println("Поздравляю с покупкой");
                                        endWhile = false;
                                        break;
                                    } else {
                                        System.out.println("У вас не хватает денег на покупку");
                                        endWhile = false;
                                        break;
                                    }
                                }
                                case 2: {
                                    System.out.println("Вы вышли с таверны");
                                    endWhile = false;
                                    break;
                                }
                                default: {
                                    endWhile = false;
                                    break;
                                }
                            }
                            break;
                        } else {
                            double damageWeapon = mainHero.getDamage() * 1.8;
                            double price = mainHero.getWeapon().getPrice() * 1.4;

                            System.out.println("Полагаю магу нужен гримуар? Могу предложить вот этот гримуар со стоимостью " + price);
                            System.out.println("гримуар с уроном: " + damageWeapon + "\n" +
                                    "1) Купить\n" +
                                    "2) Выйти с таверны\n");
                            int choice = new Scanner(System.in).nextInt();
                            switch (choice) {
                                case 1: {
                                    if (mainHero.getMoney() >= price) {
                                        mainHero.getWeapon().setDamage(damageWeapon);
                                        mainHero.getWeapon().setPrice(price);
                                        mainHero.setMoney(mainHero.getMoney() - price);
                                        System.out.println("Поздравляю с покупкой");
                                        endWhile = false;
                                        break;
                                    } else {
                                        System.out.println("У вас не хватает денег на покупку");
                                        endWhile = false;
                                        break;
                                    }
                                }
                                case 2: {
                                    System.out.println("Вы вышли с таверны");
                                    endWhile = false;
                                    break;
                                }
                                default: {
                                    endWhile = false;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    case 2: {
                        System.out.println("Какой тип предмета хотите преобрасти?\n" +
                                "1) Типа Поддешки\n" +
                                "2) Типа Защита" +
                                "3) выйти с таверны");
                        int choice = new Scanner(System.in).nextInt();
                        switch (choice) {
                            case 1: {
                                System.out.println("У меня есть вот такие предметы: ");
                                System.out.println(Items.POLITION_LIFE.getDescription() + ": стоит " + Items.POLITION_LIFE.getPrice());
                                System.out.println("даёт " + Items.POLITION_LIFE.getValue() + "здоровья");
                                System.out.println("1) купить\n" +
                                        "2) выйти");
                                int choice2 = new Scanner(System.in).nextInt();
                                switch (choice2) {
                                    case 1: {
                                        if (mainHero.getMoney() >= Items.POLITION_LIFE.getPrice()) {
                                            mainHero.getItems().add(Items.POLITION_LIFE);
                                            mainHero.setMoney(mainHero.getMoney() - Items.POLITION_LIFE.getPrice());
                                            System.out.println("Поздравляю с покупкой!");
                                            endWhile = false;
                                            break;
                                        } else {
                                            System.out.println("У вас не хватает денег на покупку");
                                            endWhile = false;
                                            break;
                                        }
                                    }
                                    case 2: {
                                        System.out.println("Вы вышли с таверны");
                                        endWhile = false;
                                        break;
                                    }
                                    default: {
                                        endWhile = false;
                                        break;
                                    }
                                }
                                break;
                            }
                            case 2: {

                                System.out.println("У меня есть вот такие предметы: ");
                                System.out.println(Items.SHIELD.getDescription() + ": стоит " + Items.SHIELD);
                                System.out.println("даёт " + Items.SHIELD.getValue() + "щита");
                                System.out.println("1) купить\n" +
                                        "2) выйти");
                                int choice2 = new Scanner(System.in).nextInt();
                                switch (choice2) {
                                    case 1: {
                                        if (mainHero.getMoney() >= Items.SHIELD.getPrice()) {
                                            mainHero.getItems().add(Items.SHIELD);
                                            mainHero.setMoney(mainHero.getMoney() - Items.SHIELD.getPrice());
                                            System.out.println("Поздравляю с покупкой!");
                                            endWhile = false;
                                            break;
                                        } else {
                                            System.out.println("У вас не хватает денег на покупку");
                                            endWhile = false;
                                            break;
                                        }
                                    }
                                    case 2: {
                                        System.out.println("Вы вышли с таверны");
                                        endWhile = false;
                                        break;
                                    }
                                    default: {
                                        endWhile = false;
                                        break;
                                    }
                                }
                                break;
                            }
                            default: {
                                endWhile = false;
                                break;
                            }

                        }
                        break;

                    }
                    default: {
                        System.out.println("Вы вышли с таверны");
                        endWhile = false;
                        break;
                    }
                }
            }catch (InputMismatchException e) {
                System.out.println("Нельзя писать что то другое кроме целочисленных цифер");
            }
        }

//        while (endWhile) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Какой меч желаешь?");
//            for (int i = 1; i <= weapons.size(); i++) {
//                System.out.println(i + ") меч с уроном: " + weapons.get(i - 1).getDamage() + " стоит: " + weapons.get(i - 1).getPrice());
//            }
//            System.out.println((weapons.size() + 1) + ") Выйти с Таверны оружия");
//            int choiceBuy = sc.nextInt();
//            if (choiceBuy <= weapons.size()) {
//                for (int i = 1; i <= weapons.size(); i++) {
//                    if (choiceBuy == i) {
//                        if (mainHero.getMoney() >= weapons.get(i-1).getPrice()) {
//                            mainHero.setMoney(mainHero.getMoney() - weapons.get(i-1).getPrice());
//                            mainHero.setWeapon(weapons.get(i-1));
//                            System.out.println("С вашего баланса было вычтено " + weapons.get(i-1).getPrice());
//                            System.out.println("Поздравляю с покупкой " + mainHero.getName() + "! Приходи ещё!");
//
//                            endWhile = false;
//                            break;
//                        } else {
//                            System.out.println("У тебя не хватает денег, иди в подземелье может там с монстров что то выбьешь");
//                            endWhile = false;
//                            break;
//                        }
//                    } else if(weapons.size() + 1 <= choiceBuy){
//                        System.out.println("Вы вышли с таверны");
//                        endWhile = false;
//                        break;
//                    }
//                }
//            } else {
//                endWhile = false;
//                break;
//            }
//        }
    }

    public int choice(MainHero mainHero) {

        System.out.println("Что желаешь купить?\n" +
                "1) оружие под класс\n" +
                "2) предметы Защиты, Поддешки\n" +
                "3) выйти из таверны\n");
        int choice = new Scanner(System.in).nextInt();
        return choice;
    }
}
