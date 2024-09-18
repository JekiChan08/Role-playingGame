package plot;

import Characters.MainHero;
import Characters.Rassa;
import plot.endings.EndPerson;

import java.util.InputMismatchException;
import java.util.Scanner;

//Сюжет
public class Plot {
    public static void startingPlot(MainHero mainHero) {
        //начало сюжета
        boolean endWhile = true;
        while (endWhile) {
            try {
            Beginning.ChoosingRace(mainHero);
            }catch (InputMismatchException e) {
                System.out.println("Нельзя писать что то другое кроме целочисленных цифер");
                Beginning.ChoosingRace(mainHero);

            }
            if (mainHero.getRassa() == Rassa.PERSON) {
                EndPerson.start(mainHero);
                endWhile = false;
            }
        }
    }
}
