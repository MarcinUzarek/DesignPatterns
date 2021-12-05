package command_pattern.my_command;

import command_pattern.my_command.tracks.PlayFirstTrack;
import command_pattern.my_command.tracks.PlayNextTrack;
import command_pattern.my_command.tracks.PlayRandomTrack;

public class Main {

    public static void main(String[] args) {


        MusicPlayer musicPlayer = new MusicPlayer();
        MusicPlayerRemote remote = new MusicPlayerRemote();

        remote.setMusicPlayerCommand(new PlayFirstTrack(musicPlayer));
        remote.pressButton();
        remote.setMusicPlayerCommand(new PlayNextTrack(musicPlayer));
        remote.pressButton();
        remote.pressButton();
        remote.pressButton();
        remote.setMusicPlayerCommand(new PlayRandomTrack(musicPlayer));
        remote.pressButton();
        remote.pressButton();
    }
}
