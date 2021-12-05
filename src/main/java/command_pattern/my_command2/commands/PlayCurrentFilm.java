package command_pattern.my_command2.commands;

import command_pattern.my_command2.FilmPlayer;
import command_pattern.my_command2.FilmPlayerCommand;

import java.util.List;

public class PlayCurrentFilm implements FilmPlayerCommand {

    private FilmPlayer filmPlayer;

    public PlayCurrentFilm(FilmPlayer filmPlayer) {
        this.filmPlayer = filmPlayer;
    }

    @Override
    public void play() {
        List<String> movies = filmPlayer.getFilms();
        if (movies.size() == 0) {
            System.out.println("The list is empty");
        } else {
            System.out.println("Playing " + movies.get(0));
            movies.remove(0);
        }
    }
}
