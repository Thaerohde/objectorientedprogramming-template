package oop.pset3.rockscissorspaperlizardspock.controller;

import oop.pset3.rockscissorspaperlizardspock.model.Choice;
import oop.pset3.rockscissorspaperlizardspock.model.Choices;
import oop.pset3.rockscissorspaperlizardspock.model.Player;
import oop.pset3.rockscissorspaperlizardspock.model.Result;
import oop.pset3.rockscissorspaperlizardspock.view.ComputerPlayer;
import oop.pset3.rockscissorspaperlizardspock.view.HumanPlayer;
import oop.pset3.rockscissorspaperlizardspock.view.Judge;
import oop.pset3.rockscissorspaperlizardspock.view.Viewer;

public class RockScissorsPaperGame {

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
        Viewer viewer = new Viewer();
        Choices choices = new Choices();
        Judge consultation = new Judge();
        Choice player1Choice = player1.playOneRound(choices);
        Choice player2Choice = player2.playOneRound(choices);
        Result result = consultation.getResult(player1Choice, player2Choice);
        viewer.viewer(result);
    }


}
