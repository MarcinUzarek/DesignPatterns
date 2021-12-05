package command_pattern.my_command2.commands;

import command_pattern.my_command2.FilmPlayer;
import command_pattern.my_command2.FilmPlayerCommand;

import java.util.List;

public class PlayNextFilm implements FilmPlayerCommand {

   private FilmPlayer filmPlayer;

    public PlayNextFilm(FilmPlayer filmPlayer) {
        this.filmPlayer = filmPlayer;
    }

    @Override
    public void play() {
        List<String> movies = filmPlayer.getFilms();
        if (movies.size() <= 1) {
            System.out.println("Only Current film is left on the list");
        } else {
            System.out.println("Playing " + movies.get(1));
            movies.remove(1);
        }
    }
}
