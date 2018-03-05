package oop.pset2.rockscissorspaper;

public class RockScissorsPaperGame {
    public void play() {
        Choices choises = new Choices();

        Player volunteer = new HumanPlayer();
        Player computerPlayer = new ComputerPlayer();
        String humanChoice = volunteer.playOneRound(choises);
        String computerChoice = computerPlayer.playOneRound(choises);
        Judge consultation = new Judge();
        consultation.SayResult(humanChoice,computerChoice);



    }
}
