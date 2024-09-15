package plot;

import Characters.MainHero;
import Characters.PersonClass;
import Characters.Rassa;

import java.util.Scanner;
//начало сюжета
public class Beginning {
    //выбор имени рассы и класса
    public static void ChoosingRace(MainHero mainHero) {

        System.out.println("Привет игрок как тебя зовут?");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        mainHero.setName(name);

        boolean endWhile = true;
        while (endWhile) {
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
                    System.out.println("Теперь ваша расса: " + mainHero.getRassa().getTitle());
                    endWhile = false;
                    break;
                case 2:
                    mainHero.setRassa(Rassa.DWARF);
                    System.out.println("Теперь ваша расса: " + mainHero.getRassa().getTitle());
                    endWhile = false;
                    break;
                case 3:
                    mainHero.setRassa(Rassa.ELF);
                    System.out.println("Теперь ваша расса: " + mainHero.getRassa().getTitle());
                    endWhile = false;
                    break;
                case 4:
                    mainHero.setRassa(Rassa.ORC);
                    System.out.println("Теперь ваша расса: " + mainHero.getRassa().getTitle());
                    endWhile = false;
                    break;
                default: {
                    System.out.println("Такой рассы нету на выбор, выберите снова");
                    break;
                }
            }
        }
        endWhile = true;
        while (endWhile) {
            System.out.println(mainHero.getName() + " Выберете класс для вашего персонажа: \n" +
                    "1) воин\n" +
                    "2) маг\n" +
                    "3) танк\n");
            int classPerson = sc.nextInt();
            switch (classPerson) {
                case 1: {
                    mainHero.setPersonClass(PersonClass.WARRIOR);
                    System.out.println("Теперь вы: " + mainHero.getPersonClass().getTitle());
                    endWhile = false;
                    break;
                }
                case 2 : {
                    mainHero.setPersonClass(PersonClass.MAG);
                    System.out.println("Теперь вы: " + mainHero.getPersonClass().getTitle());
                    endWhile = false;
                    break;
                }
                case 3 : {
                    mainHero.setPersonClass(PersonClass.TANK);
                    System.out.println("Теперь вы: " + mainHero.getPersonClass().getTitle());
                    endWhile = false;
                    break;
                } default: {
                    System.out.println("Такого класса нет, выберите то что предложено");
                    break;
                }
            }
        }

    }
}
