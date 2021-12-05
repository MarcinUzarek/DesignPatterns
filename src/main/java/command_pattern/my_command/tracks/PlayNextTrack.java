package command_pattern.my_command.tracks;

import command_pattern.my_command.MusicPlayerCommad;
import command_pattern.my_command.MusicPlayer;

public class PlayNextTrack implements MusicPlayerCommad {

    private MusicPlayer musicPlayer;

    public PlayNextTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playNextTrack();
    }
}
