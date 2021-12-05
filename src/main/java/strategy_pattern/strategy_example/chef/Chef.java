package strategy_pattern.strategy_example.chef;

import lombok.Getter;
import lombok.Setter;
import strategy_pattern.strategy_example.egg_cooker.EggCooker;

@Getter
@Setter
public class Chef {

    private String name;
    private EggCooker eggCooker;

    public Chef(String name) {
        this.name = name;
    }

    public void cook() {
        eggCooker.cookEgg();
    }


}
