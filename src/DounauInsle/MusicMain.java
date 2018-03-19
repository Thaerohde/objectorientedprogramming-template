package DounauInsle;

public class MusicMain {
    private static Fan fan = new Fan();
    public static void main(String[] args) {
        Band band = new Band();
        Music music = new Music();




        music.getMusic()
                .stream()
                .map(song1->song1.getName())
                .filter(songName-> isListen(songName))
                .forEach(s -> System.out.println(s));




    }

    private static boolean isListen(String songName) {
        if(songName == fan.bestSong().getName())
        {
            return true;
        }


        return false;
    }


}
