package singleton_pattern.game_engine;

public enum GameEngineEnum {

    //Enum implementations, but its definition protects from serialization,
    //and it can have only one instance so its singleton.

    INSTANCE("Marcin");

    private int hp = 100;
    private String characterName = "";

     GameEngineEnum(String name) {
        this.characterName = name;
    }

    public void run() {
        while (true) {
            //player input
            //changing game state
            //rendering graphics
        }
    }
}
