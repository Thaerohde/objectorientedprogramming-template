package DounauInsle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Music {
    private List<Song> songs;



    public void music(){
        List<Song> songs = Stream.of(
                new Rock(),
                new Pop(),
                new  HeavyMetal()
        ).collect(Collectors.toList());

    }
    public List<Song> getMusic(){
        return new ArrayList<>(songs);
    }
}
