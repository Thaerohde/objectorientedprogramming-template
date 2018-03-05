package oop.pset2.rockscissorspaper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Choices {
    private List<Choice> choises;
    protected List<Choice> Choices(){
        choises = Stream.of(
                new Rock(),
                new Paper(),
                new Scissors()
        ).collect(Collectors.toList());
        return choises;
    }
    public List<Choice> getChoises() {

        return new ArrayList<>(choises);
    }
}

}
