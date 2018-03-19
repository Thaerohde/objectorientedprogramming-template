package DounauInsle;

import java.util.Random;
import java.util.stream.Collectors;

public class Fan {
    public Song bestSong(){
        Random random = new Random();
        Music music = new Music();
        return music.getMusic().stream().collect(Collectors.toList()).get(random.nextInt());
    }


}
