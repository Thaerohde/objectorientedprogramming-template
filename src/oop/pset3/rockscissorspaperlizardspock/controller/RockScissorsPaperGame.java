package oop.pset3.rockscissorspaperlizardspock.controller;

import oop.pset3.rockscissorspaperlizardspock.model.*;
import oop.pset3.rockscissorspaperlizardspock.model.Judge;
import oop.pset3.rockscissorspaperlizardspock.view.Viewer;

public class RockScissorsPaperGame {
    private Viewer viewer = new Viewer();

    public void play() {

        Player player1 = new HumanPlayer();
        Player player2 = new ComputerPlayer();
        do {
            playRound(player1, player2);
        }
        while (wantToPlayAgain(player1, player2));
    }

    private boolean wantToPlayAgain(Player player1, Player player2) {
        return player1.wantToPlay() && player2.wantToPlay();
    }

    private void playRound(Player player1, Player player2) {

        Choices choices = new Choices();
        Judge consultant = new Judge();
        Choice player1Choice = player1.playOneRound(choices);
        Choice player2Choice = player2.playOneRound(choices);
        if (player1Choice.getName().equals(player2Choice.getName())) {
            viewer.gettie();
        } else {
            ChoiceType winChoice = consultant.getResult(player1Choice, player2Choice);
            viewer.viewTheResult(getResult(player1Choice, player2Choice, winChoice));
        }
    }

    private Result getResult(Choice player1Choice, Choice player2Choice, ChoiceType winChoice) {

        Result result = new Result();
        result.setChoice1(player1Choice);
        result.setChoice2(player2Choice);
        result.setWinner(winChoice);
        return result;
    }


}
