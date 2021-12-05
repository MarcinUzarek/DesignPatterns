package command_pattern.my_command2;

import java.util.ArrayList;
import java.util.List;

public class FilmPlayer {

    private List<String> films = new ArrayList<>();

    public void addFilm(String film) {
        films.add(film);
    }
    public void showFilmList() {
        for(String film : films) {
            System.out.println(film);
        }
        if (films.isEmpty()) {
            System.out.println("The film list is empty");
        }
    }

    public List<String> getFilms() {
        return films;
    }
}
