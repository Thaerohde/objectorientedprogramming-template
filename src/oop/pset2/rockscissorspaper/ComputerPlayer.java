package oop.pset2.rockscissorspaper;

import java.util.Scanner;

public class ComputerPlayer implements Player {
    @Override
    public String playOneRound(Choices choises) {
        new Greeting();
        Choices choices = new Choices();
        new ShowChoices(choices);
        return getAChoice();

    }

    private String getAChoice() {
        Scanner scanner = new Scanner(System.in);
        String choice  = scanner.next();
        return choice;

    }



}
