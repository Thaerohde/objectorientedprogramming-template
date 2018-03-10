package oop.pset3.rockscissorspaperlizardspock.model;

public class Scissors implements Choice {


    @Override
    public ChoiceType getName() {
        return ChoiceType.Scissors;
    }

    @Override
    public boolean isWin(Choice choice) {
        return ((choice.getName().equals(ChoiceType.Lizard) || (choice.getName().equals(ChoiceType.Paper))));
    }
}
  