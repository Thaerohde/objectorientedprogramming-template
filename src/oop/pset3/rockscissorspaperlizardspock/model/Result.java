package oop.pset3.rockscissorspaperlizardspock.model;

public class Result {

    private Choice choice1;
    private Choice choice2;
    private ChoiceType winner;

    public Choice getChoice1() {
        return choice1;
    }

    public void setChoice1(Choice choice1) {
        this.choice1 = choice1;
    }

    public Choice getChoice2() {
        return choice2;
    }

    public void setChoice2(Choice choice2) {
        this.choice2 = choice2;
    }

    public ChoiceType getWinner() {
        return winner;
    }

    public void setWinner(ChoiceType winner) {
        this.winner = winner;
    }
}
