package oop.pset3.rockscissorspaperlizardspock.view;

import oop.pset3.rockscissorspaperlizardspock.model.Choice;
import oop.pset3.rockscissorspaperlizardspock.model.Choices;
import oop.pset3.rockscissorspaperlizardspock.model.Player;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HumanPlayer implements Player {
    private HashMap<String, String> jury;

    @Override
    public Choice playOneRound(Choices choises) {
        //Greeting();
        Choices choices = new Choices();
        System.out.println("Please choose one from the following List");
        ShowChoices(choices);
        Scanner scanner = new Scanner(System.in);
        Choice humanChoice = getAChoice(choises);
        System.out.println("Your choice is : " + humanChoice.getName());

        return humanChoice;
    }

    public HumanPlayer() {
        jury = new HashMap<>();
        jury.put("rock", "scissors");
        jury.put("scissors", "paper");
        jury.put("paper", "rock");
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

    @Override
    public boolean isWin(Choice choice1, Choice choice2) {
        return findWinner(choice1, choice2);
    }


    private Choice getAChoice(Choices choises) {

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        if (choises.getChoises().stream()
                .filter(move -> move.getName().equalsIgnoreCase(choice))

                .findFirst().isPresent()) {

            return choises.getChoises().stream()
                    .filter(move -> move.getName().equalsIgnoreCase(choice))

                    .findFirst().get();
        } else {
            System.out.println("Invalid move");
            System.exit(1);
        }
        return choises.getChoises().stream()
                .filter(move -> move.getName().equalsIgnoreCase(choice))

                .findFirst().get();

    }



    private void ShowChoices(Choices choices) {
        List<String> choice = choices.getChoises()
                .stream()

                .map(e -> e.getName())
                .collect(Collectors.toList());
        System.out.println(choice);
    }
    private boolean findWinner(Choice choice1, Choice choice2) {
        String [] choice = 

       if(choice1 == choice2.equals(choice1.))


    }

}
