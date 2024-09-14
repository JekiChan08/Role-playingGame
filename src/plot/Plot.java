package plot;

import Characters.MainHero;
import Characters.Rassa;

import java.util.Scanner;

//Сюжет, не придусал как это реализовать
public class Plot {
    //выбор имени и рассы
    public static void ChoosingRace(MainHero mainHero) {
        System.out.println("Привет игрок как тебя зовут?");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        mainHero.setName(name);

        boolean endWhile = false;
        while (!endWhile) {
            System.out.println("Здравствуйте " + mainHero.getName() + ", выберите рассу написав число:\n" +
                    "1) Человек\n" +
                    "2) Гном\n" +
                    "3) Эльф\n" +
                    "4) Орк\n" +
                    "по выбранному персоважу будет по разному развиваться сюжет");

            int rassNum = sc.nextInt();

                //Выбор и инициализация рассы
                switch (rassNum) {
                    case 1:
                        mainHero.setRassa(Rassa.PERSON);
                        System.out.println("Теперь ваша расса: Человек");
                        endWhile = true;
                        break;
                    case 2:
                        mainHero.setRassa(Rassa.DWARF);
                        System.out.println("Теперь ваша расса: Гном");
                        endWhile = true;
                        break;
                    case 3:
                        mainHero.setRassa(Rassa.ELF);
                        System.out.println("Теперь ваша расса: Эльф");
                        endWhile = true;
                        break;
                    case 4:
                        mainHero.setRassa(Rassa.ORC);
                        System.out.println("Теперь ваша расса: Орк");
                        endWhile = true;
                        break;
                    default: {
                        System.out.println("Такой рассы нету на выбор");
                        break;
                }
            }
        }
    }
}
