package command_pattern.my_command.tracks;

import command_pattern.my_command.MusicPlayerCommad;
import command_pattern.my_command.MusicPlayer;

public class PlayRandomTrack implements MusicPlayerCommad {

    MusicPlayer musicPlayer;

    public PlayRandomTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playRandomTrack();
    }
}