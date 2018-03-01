package oop.pset2.rockscissorspaper;

public enum  PlayerChoice {
    ROCK(0),SCISSORS(1),PAPER(3);

    private Integer choice;

    PlayerChoice(Integer choice) {
        this.choice = choice;

    }
    public Integer getChoice(){
        return choice;
    }
}
