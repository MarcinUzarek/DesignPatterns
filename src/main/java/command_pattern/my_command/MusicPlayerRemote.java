package command_pattern.my_command;

public class MusicPlayerRemote {

    private MusicPlayerCommad musicPlayerCommad;

    public void setMusicPlayerCommand(MusicPlayerCommad command) {
        this.musicPlayerCommad = command;
    }

    public void pressButton() {
        musicPlayerCommad.play();
    }
}
