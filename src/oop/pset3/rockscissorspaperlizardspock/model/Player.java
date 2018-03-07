package oop.pset3.rockscissorspaperlizardspock.model;

public interface Player {

    Choice playOneRound(Choices choises);
    boolean wantToPlay();
    boolean isWin(Choice Player1Choice, Choice player2Choice2);
}
