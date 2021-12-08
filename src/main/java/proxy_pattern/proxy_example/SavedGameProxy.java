package proxy_pattern.proxy_example;

public class SavedGameProxy implements SavedGame{

    private SavedGame sg;
    private String name;


    @Override
    public void initialize() {
        this.name = "Save Game - " + System.currentTimeMillis();
    }

    @Override
    public void loadGame() {
        sg = new SavedGameFull();
        sg.initialize();
        sg.loadGame();

    }

    @Override
    public String getName() {
        return this.name;
    }
}
