package oop.pset2.rockscissorspaper;

import java.util.Scanner;
import java.util.stream.Collectors;

public class HumanPlayer implements Player {

    @Override
    public String playOneRound(Choices choises) {
        new Greeting();
        Choices choices = new Choices();
        String options = ShowChoices(choices);


    }

    private String getAChoice() {
        Scanner scanner = new Scanner(System.in);
        String choice  = scanner.next();
        return choice;

    }



        private String ShowChoices(Choices choices) {
            String choise = choices.getChoises()
                    .stream()
                    .map(e->e.getName())
                    .collect(Collectors.joining(","));
            return choise;
        }

}
