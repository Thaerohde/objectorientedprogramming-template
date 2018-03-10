package oop.pset3.rockscissorspaperlizardspock.controller;

import oop.pset3.rockscissorspaperlizardspock.model.*;
import oop.pset3.rockscissorspaperlizardspock.view.Viewer;

import java.util.Scanner;
import java.util.stream.Stream;

public class HumanPlayer implements Player {


    @Override
    public Choice playOneRound(Choices choises) {

        Choices choices = new Choices();
        Viewer.showChoices();

        Choice humanChoice = getAChoice(choises);
        Viewer.viewPlayer1Choise(humanChoice.getName());

        return humanChoice;
    }


    @Override
    public boolean wantToPlay() {
        Viewer.player1WantToPlay();
        Scanner scanner = new Scanner(System.in);
        String feedBack = scanner.next();
        if ((feedBack.equalsIgnoreCase("Yes")) || (feedBack.equalsIgnoreCase("Y"))) {
            return true;
        } else return false;
    }


    private Choice getAChoice(Choices choices) {

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next().toUpperCase();
        return Stream.of(choices).flatMap(e -> e.getChoises().stream())
                .filter(e -> choice.equalsIgnoreCase(e.getName().toString()))
                .findFirst().get();
    }
}








