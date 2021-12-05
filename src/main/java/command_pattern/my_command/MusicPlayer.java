package command_pattern.my_command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MusicPlayer {

    private final List<String> tracks = Arrays.asList("Track 1", "Track 2", "Track 3");
    private static int currentTrackNumber = 0;

    public void playFirstTrack() {
        System.out.println("Playing Track 1");
        currentTrackNumber = 1;
    }

    public void playNextTrack() {
        currentTrackNumber++;
        if (currentTrackNumber == 4) {
            currentTrackNumber = 1;
        }
        System.out.println("Playing Track " + currentTrackNumber);
    }

    public void playRandomTrack() {
        Random random = new Random();

        currentTrackNumber = random.nextInt(1,4);
        System.out.println("Playing Track " + currentTrackNumber);
    }
}
