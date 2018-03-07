package oop.pset2.rockscissorspaper.view;

import oop.pset2.rockscissorspaper.model.Player;
import oop.pset2.rockscissorspaper.model.Choice;
import oop.pset2.rockscissorspaper.model.Choices;

import java.util.Collections;
import java.util.List;

public class Player2 implements Player {
    @Override
    public Choice playOneRound(Choices choises) {
        return getComputerPlayerChoice(choises);

    }

    private Choice getComputerPlayerChoice(Choices choises) {
        List<Choice> computerChoice = choises.getChoises();
        Collections.shuffle(computerChoice);
        System.out.println("Computer choice is: " +computerChoice.get(0).getName());
        return computerChoice.get(0);
    }

}
