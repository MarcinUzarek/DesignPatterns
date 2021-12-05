package command_pattern.my_command2.commands;

import command_pattern.my_command2.FilmPlayer;
import command_pattern.my_command2.FilmPlayerCommand;

public class PlayAllFilms implements FilmPlayerCommand {

    private FilmPlayer filmPlayer;

    public PlayAllFilms(FilmPlayer filmPlayer) {
        this.filmPlayer = filmPlayer;
    }

    @Override
    public void play() {
        for (String film : filmPlayer.getFilms()) {
            System.out.println("Playing " + film);
        }
        filmPlayer.getFilms().clear();
    }
}
