package oop.pset3.rockscissorspaperlizardspock.view;

import oop.pset3.rockscissorspaperlizardspock.model.Choice;
import oop.pset3.rockscissorspaperlizardspock.model.Player;
import oop.pset3.rockscissorspaperlizardspock.model.Result;

import java.util.HashMap;

public class Judge {



    //        String[] options = {"ROCK", "SCISSORS", "PAPER"};
//        Integer difference = ((computerChoice.toUpperCase()).indexOf(String.valueOf(options)) - humanChoice.toUpperCase().indexOf(String.valueOf(options)));
//
//        if (difference == 0) {
//            System.out.println("its a tie,no one wins");
//
//        } else if ((difference == -1) || (difference == -2)) {
//            System.out.println("You lost !!!!");
//        } else System.out.println("You won! ");


    public Result getResult(Choice choice1, Choice choice2) {
        Result result = new Result();
        result.setChoice1(choice1);
        result.setChoice2(choice2);



        result.setWinner(findWinner(choice1, choice2));
        return result;
    }




}


