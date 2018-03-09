package oop.pset3.rockscissorspaperlizardspock.view;


import oop.pset2.rockscissorspaper.model.Choice;
import oop.pset2.rockscissorspaper.model.Result;
import oop.pset3.rockscissorspaperlizardspock.model.ChoiceType;

public class Viewer {

    public void viewer(Result result) {
        System.out.println(result.getWinner());
    }
    public void showChoices(){
        System.out.println("Hello, to play, choose from the list: Rock, Scissor, Paper, Lizard, Spock ");
    }
    public void viewPlayer1Choise(ChoiceType choice){
        System.out.println("Your choice is : " + choice);
    }


}



