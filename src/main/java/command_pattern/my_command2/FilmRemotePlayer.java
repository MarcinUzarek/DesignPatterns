package command_pattern.my_command2;

public class FilmRemotePlayer {

    private FilmPlayer filmPlayer;
    private FilmPlayerCommand command;

    public void setFilmToPlay(FilmPlayerCommand command) {
        this.command = command;
    }

    public void go() {
        command.play();
    }
}
