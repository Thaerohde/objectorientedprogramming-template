package oop.pset3.rockscissorspaperlizardspock.view;

import oop.pset3.rockscissorspaperlizardspock.model.Choice;
import oop.pset3.rockscissorspaperlizardspock.model.ChoiceType;
import oop.pset3.rockscissorspaperlizardspock.model.Choices;
import oop.pset3.rockscissorspaperlizardspock.model.Player;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HumanPlayer implements Player {


    @Override
    public Choice playOneRound(Choices choises) {
        Viewer viewer = new Viewer();
        //Greeting();
        Choices choices = new Choices();
        viewer.showChoices();

        Choice humanChoice = getAChoice(choises);
        viewer.viewPlayer1Choise(humanChoice.);

        return humanChoice;
    }



    @Override
    public boolean wantToPlay() {
        System.out.println("Do you want to play again?");
        Scanner scanner = new Scanner(System.in);
        String feedBack = scanner.next();
        if ((feedBack.equalsIgnoreCase("Yes")) || (feedBack.equalsIgnoreCase("Y"))) {
            return true;
        } else return false;
    }



    private Choice getAChoice(Choices choises) {

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        if (choises.getChoises().stream()
                .filter(move -> move.getName().equals(choice))

                .findFirst().isPresent()) {

            return choises.getChoises().stream()
                    .filter(move -> move.getName().equals(choice))

                    .findFirst().get();
        } else {
            System.out.println("Invalid move");
            System.exit(1);
        }
        return choises.getChoises().stream()
                .filter(move -> move.getName().equals(choice))

                .findFirst().get();

    }


}

