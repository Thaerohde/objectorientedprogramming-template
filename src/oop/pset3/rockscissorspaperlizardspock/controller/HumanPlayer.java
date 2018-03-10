package oop.pset3.rockscissorspaperlizardspock.controller;

import oop.pset3.rockscissorspaperlizardspock.model.*;
import oop.pset3.rockscissorspaperlizardspock.view.Viewer;

import java.util.Scanner;
import java.util.stream.Stream;

public class HumanPlayer implements Player {
    Viewer viewer = new Viewer();


    @Override
    public Choice playOneRound(Choices choises) {

        Choices choices = new Choices();
        viewer.showChoices();

        Choice humanChoice = getAChoice(choises);
        viewer.viewPlayer1Choise(humanChoice);

        return humanChoice;
    }


    @Override
    public boolean wantToPlay() {
        viewer.player1WantToPlay();
        Scanner scanner = new Scanner(System.in);
        String feedBack = scanner.next();
        if ((feedBack.equalsIgnoreCase("Yes")) || (feedBack.equalsIgnoreCase("Y"))) {
            return true;
        } else return false;
    }


    private Choice getAChoice(Choices choices) {

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("rock")) {
            return new Rock();
        }
        if (choice.equalsIgnoreCase("Scissors")) {
            return new Scissors();
        }
        if (choice.equalsIgnoreCase("Paper")) {
            return new Paper();
        }
        if (choice.equalsIgnoreCase("Lizard")) {
            return new Lizard();
        }

        return new Spock();
    }
}




       /* ChoiceType type = Stream.of(choices.getName())

                .peek(e-> System.out.println(e))
                .filter(move -> move.equals(choice))
                .findFirst().get();


        if (type != null) {
            return type;
        } else {
            System.out.println("Invalid move");
            System.exit(1);
        }
        return type;*/





