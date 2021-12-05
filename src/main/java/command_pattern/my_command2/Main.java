package command_pattern.my_command2;

import command_pattern.my_command2.commands.PlayAllFilms;
import command_pattern.my_command2.commands.PlayCurrentFilm;
import command_pattern.my_command2.commands.PlayNextFilm;

public class Main {
    public static void main(String[] args) {

        FilmPlayer filmPlayer = new FilmPlayer();
        FilmRemotePlayer remote = new FilmRemotePlayer();

        filmPlayer.addFilm("Shrek");
        filmPlayer.addFilm("Shawshank redemption");
        filmPlayer.addFilm("Intouchables");
        filmPlayer.addFilm("One Flew Over Cuckoo's Nest");
        filmPlayer.addFilm("Inception");
        filmPlayer.addFilm("Shuttered Island");
        filmPlayer.showFilmList();

        System.out.println("----------------------------------------------------");

        remote.setFilmToPlay(new PlayCurrentFilm(filmPlayer));
        remote.go();
        remote.setFilmToPlay(new PlayNextFilm(filmPlayer));
        remote.go();
        remote.setFilmToPlay(new PlayAllFilms(filmPlayer));
        remote.go();
        filmPlayer.showFilmList();
    }
}

