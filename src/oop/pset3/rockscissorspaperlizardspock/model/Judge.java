package oop.pset3.rockscissorspaperlizardspock.model;

import oop.pset3.rockscissorspaperlizardspock.model.Choice;
import oop.pset3.rockscissorspaperlizardspock.model.ChoiceType;
import oop.pset3.rockscissorspaperlizardspock.model.Player;
import oop.pset3.rockscissorspaperlizardspock.model.Result;

import java.util.HashMap;

public class Judge {

    public ChoiceType getResult(Choice choice1, Choice choice2) {
        if (choice1.isWin(choice2)){
            return choice1.getName();
        }

        return choice2.getName();
    }

}


