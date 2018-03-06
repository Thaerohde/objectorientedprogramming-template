package oop.pset2.rockscissorspaper;

import java.util.Collections;
import java.util.List;

public class ComputerPlayer implements Player {
    @Override
    public String playOneRound(Choices choises) {
        return String.valueOf(getComputerPlayerChoice(choises));

    }

    private String getComputerPlayerChoice(Choices choises) {
        List<Choice> computerChoice = choises.getChoises();
        Collections.shuffle(computerChoice);
        System.out.println("Computer choice is: " +computerChoice.get(0).getName());
        return computerChoice.get(0).getName();
    }


}
