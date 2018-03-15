package oop.pset3.rockscissorspaperlizardspock.model;

public class Judge {

    public Result getResult(Choice choice1, Choice choice2) {
        Result result = new Result();
        result.setChoice1(choice1);
        result.setChoice2(choice2);
        result.setWinner(getWinner(choice1, choice2));
        return result;
    }

    private String getWinner(Choice choice1, Choice choice2) {
        if (choice1.isWin(choice2)) {
            return choice1.getName().toString();
        }
        if (choice2.isWin(choice1)) {
            return choice1.getName().toString();
        }
        return "No one!!";
    }

}


