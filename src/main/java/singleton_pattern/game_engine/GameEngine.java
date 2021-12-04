package singleton_pattern.game_engine;

import java.io.Serial;
import java.io.Serializable;

public class GameEngine implements Serializable {

    private int hp = 100;
    private String characterName = "";
    private static GameEngine instance = new GameEngine();

    private GameEngine() {
    }

    public void run() {
        while (true) {
            //player input
            //changing game state
            //rendering graphics
        }
    }

    public static GameEngine getInstance() {
        return instance;
    }

    //It protects from creating Game Engine objects by de-serializating it.
    @Serial
    protected Object readResolve(){
        return getInstance();
    }


}
