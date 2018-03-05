package oop.pset2.rockscissorspaper;

public class Judge {
    public int SayResult(String humanChoice, String computerChoice) {

        String[] options = {"ROCK", "SCISSORS", "PAPER"};
        Integer difference = ((computerChoice.toUpperCase()).indexOf(String.valueOf(options)) - humanChoice.toUpperCase().indexOf(String.valueOf(options)));

        if (difference == 0) {
            return 0;

        } else if ((difference == -1) || (difference == -2)) {
            return 1;
        } else return -1;

    }
}
