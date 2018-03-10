package oop.pset3.rockscissorspaperlizardspock.view;



import oop.pset3.rockscissorspaperlizardspock.model.Choice;
import oop.pset3.rockscissorspaperlizardspock.model.ChoiceType;
import oop.pset3.rockscissorspaperlizardspock.model.Result;

public class Viewer {


    public static void showPlayer2Choice(ChoiceType name) {
        System.out.println("Player2 choice is: " + name);
    }

    public void showChoices(){
        System.out.println("Hello, to play, choose from the list: Rock, Scissor, Paper, Lizard, Spock ");
    }
    public void viewPlayer1Choise(Choice choice){
        System.out.println("Your choice is : " + choice.getName());
    }
    public void player1WantToPlay(){
        System.out.println("Do you want to play again?");
    }
    public void viewTheResult(Result result){
        System.out.println("The winner is  "+ result.getWinner());

    }



}



