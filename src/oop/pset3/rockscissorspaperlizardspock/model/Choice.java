package oop.pset3.rockscissorspaperlizardspock.model;

public interface Choice {
    ChoiceType getName();

    boolean isWin(Choice choice);
}
