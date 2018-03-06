package oop.pset2.rockscissorspaper;

import java.util.Scanner;
import java.util.stream.Collectors;

public class HumanPlayer implements Player {

    @Override
    public String playOneRound(Choices choises) {
        Greeting();
        Choices choices = new Choices();
        System.out.println("Please choose one from the following List");
        ShowChoices(choices);
        Scanner scanner = new Scanner(System.in);
        String humanChoice = getAChoice();
        return humanChoice.toUpperCase();


    }

    private String getAChoice() {
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        System.out.println("Your choice is: " + choice.toUpperCase());
        return choice;

    }


    private void ShowChoices(Choices choices) {
        String choise = choices.getChoises()
                .stream()
                .map(e -> e.getName())
                .collect(Collectors.joining(","));
        System.out.println(choise);
    }

    private void Greeting() {
        System.out.println("Hello,do you want to play?");

    }
}
