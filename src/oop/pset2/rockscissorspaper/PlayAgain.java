package oop.pset2.rockscissorspaper;

import java.util.Scanner;

public class PlayAgain {
    public void Playagain(){
        System.out.println("Do you want to play again?");
        Scanner scanner = new Scanner(System.in);
        String feedBack = scanner.next();
        if((feedBack.toUpperCase() == "Yes")|| (feedBack.toUpperCase() == "Y")){
            new RockScissorsPaperGame().play();
        }
        else System.exit(0);
    }
}
