package oop.pset2.rockscissorspaper;

public enum PlayerType {
    PLAYER_ONE(0),PLAYER_TWO(1);
    private Integer number;
    PlayerType (Integer number){
        this.number = number;
    }
    public Integer getNumber(){
        return number;
    }
}
