package oop.pset2.rockscissorspaper.view;

import oop.pset2.rockscissorspaper.model.Choice;
import oop.pset2.rockscissorspaper.model.Choices;
import oop.pset2.rockscissorspaper.model.Player;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Player1 implements Player {

    @Override
    public Choice playOneRound(Choices choises) {
        //Greeting();
        Choices choices = new Choices();
        System.out.println("Please choose one from the following List");
        ShowChoices(choices);
        Scanner scanner = new Scanner(System.in);
        Choice humanChoice = getAChoice(choises);
        System.out.println("Your choice is : " + humanChoice.getName() );
        return humanChoice;


    }


    private Choice getAChoice(Choices choises) {

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();

        return choises.getChoises().stream()
                .filter(move -> move.getName().equalsIgnoreCase(choice))
                .findFirst().get();

    }

    private void ShowChoices(Choices choices) {
        List<String> choice= choices.getChoises()
                .stream()

                .map(e -> e.getName())
                .collect(Collectors.toList());
        System.out.println(choice);
    }

//    private void Greeting() {
//        System.out.println("Hello,do you want to play?");
//
//    }
}
