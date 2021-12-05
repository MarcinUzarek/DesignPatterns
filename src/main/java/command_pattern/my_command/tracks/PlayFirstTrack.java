package command_pattern.my_command.tracks;

import command_pattern.my_command.MusicPlayerCommad;
import command_pattern.my_command.MusicPlayer;

public class PlayFirstTrack implements MusicPlayerCommad {

    MusicPlayer musicPlayer;

    public PlayFirstTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playFirstTrack();
    }
}
