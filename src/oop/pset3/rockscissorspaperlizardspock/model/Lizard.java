package oop.pset3.rockscissorspaperlizardspock.model;

public class Lizard implements Choice{
    @Override
    public ChoiceType getName() {
        return ChoiceType.Lizard;
    }

    @Override
    public boolean isWin(Choice choice) {
        return ((choice.getName().equals(ChoiceType.Spock)||(choice.getName().equals(ChoiceType.Paper) )));
    }
}
   /* Scissors cuts Paper

        Paper covers Rock

        Rock crushes Lizard



        Spock smashes Scissors

        Scissors decapitates Lizard



        Paper disproves Spock

        Spock vaporizes Rock

        (and as it always has) Rock crushes Scissors

