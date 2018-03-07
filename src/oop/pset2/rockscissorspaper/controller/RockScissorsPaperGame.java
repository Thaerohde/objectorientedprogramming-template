package oop.pset2.rockscissorspaper.controller;

import oop.pset2.rockscissorspaper.view.Summery;
import oop.pset2.rockscissorspaper.model.Choice;
import oop.pset2.rockscissorspaper.model.Choices;
import oop.pset2.rockscissorspaper.model.Player;
import oop.pset2.rockscissorspaper.model.Result;
import oop.pset2.rockscissorspaper.view.Player2;
import oop.pset2.rockscissorspaper.view.Player1;
import oop.pset2.rockscissorspaper.view.Judge;

import java.util.Scanner;

public class RockScissorsPaperGame {
    public void play() {
        Judge consultation = new Judge();
        Summery summary = new Summery();
        Choices choises = new Choices();
        Player volunteer = new Player1();
        Player computerPlayer = new Player2();
        do {
            Choice humanChoice = volunteer.playOneRound(choises);
            Choice computerChoice = computerPlayer.playOneRound(choises);
            Result result = consultation.getResult(humanChoice, computerChoice);
            summary.summary(result);
        }
        while (playersWantToPlay());
    }
    private boolean playersWantToPlay() {
        System.out.println("Do you want to play again?");
        Scanner scanner = new Scanner(System.in);
        String feedBack = scanner.next();
        if ((feedBack.equalsIgnoreCase("Yes")) || (feedBack.equalsIgnoreCase("Y"))) {
            return true;
        } else return false;

    }

}
