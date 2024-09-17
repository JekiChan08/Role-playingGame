package plot.location;

import Characters.MainHero;
import item.Swords;

import java.util.ArrayList;
import java.util.Scanner;

//продавец
public class Seller {
    //мечи
    private ArrayList<Swords> swords = new ArrayList<>();

    //список мечей
    public Seller() {
        swords.add(Swords.SWORD10);
        swords.add(Swords.SWORD20);
        swords.add(Swords.SWORD30);
        swords.add(Swords.SWORD40);
        swords.add(Swords.SWORD50);
        swords.add(Swords.SWORD60);
        swords.add(Swords.SWORD70);
        swords.add(Swords.SWORD80);
        swords.add(Swords.SWORD80);
        swords.add(Swords.SWORD100);
    }
    //покупка меча
    public void buySword(MainHero mainHero) {
        boolean endWhile = true;
        while (endWhile) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Какой меч желаешь?");
            for (int i = 1; i <= swords.size(); i++) {
                System.out.println(i + ") меч с уроном: " + swords.get(i - 1).getDamage() + " стоит: " + swords.get(i - 1).getPrice());
            }
            System.out.println((swords.size() + 1) + ") Выйти с Таверны оружия");
            int choiceBuy = sc.nextInt();
            if (choiceBuy <= swords.size()) {
                for (int i = 1; i <= swords.size(); i++) {
                    if (choiceBuy == i) {
                        if (mainHero.getMoney() >= swords.get(i-1).getPrice()) {
                            mainHero.setMoney(mainHero.getMoney() - swords.get(i-1).getPrice());
                            mainHero.setSword(swords.get(i-1));
                            System.out.println("С вашего баланса было вычтено " + swords.get(i-1).getPrice());
                            System.out.println("Поздравляю с покупкой " + mainHero.getName() + "! Приходи ещё!");

                            endWhile = false;
                            break;
                        } else {
                            System.out.println("У тебя не хватает денег, иди в подземелье может там с монстров что то выбьешь");
                            endWhile = false;
                            break;
                        }
                    } else if(swords.size() + 1 <= choiceBuy){
                        System.out.println("Вы вышли с таверны");
                        endWhile = false;
                        break;
                    }
                }
            } else {
                endWhile = false;
                break;
            }
        }
    }
}
