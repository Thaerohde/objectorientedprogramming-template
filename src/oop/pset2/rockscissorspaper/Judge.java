package oop.pset2.rockscissorspaper;

public class Judge {
    public void SayResult(String humanChoice, String computerChoice) {

        String[] options = {"ROCK", "SCISSORS", "PAPER"};
        Integer difference = ((computerChoice.toUpperCase()).indexOf(String.valueOf(options)) - humanChoice.toUpperCase().indexOf(String.valueOf(options)));

        if (difference == 0) {
            System.out.println("its a tie,no one wins");

        } else if ((difference == -1) || (difference == -2)) {
            System.out.println("You lost !!!!");
        } else System.out.println("You won! ");;

    }
}
