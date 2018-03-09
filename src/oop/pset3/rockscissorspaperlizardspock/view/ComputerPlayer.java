package oop.pset3.rockscissorspaperlizardspock.view;

import oop.pset3.rockscissorspaperlizardspock.model.Choice;
import oop.pset3.rockscissorspaperlizardspock.model.Choices;
import oop.pset3.rockscissorspaperlizardspock.model.Player;

import java.util.Collections;
import java.util.List;

public class ComputerPlayer implements Player {
    @Override
    public Choice playOneRound(Choices choises) {
        return getPlayer2Choice(choises);

    }

    @Override
    public boolean wantToPlay() {
        return true;
    }


    private Choice getPlayer2Choice(Choices choises) {
        List<Choice> player2Choice = choises.getChoises();
        Collections.shuffle(player2Choice);
        System.out.println("Computer choice is: " +player2Choice.get(0).getName());
        return player2Choice.get(0);
    }

}
