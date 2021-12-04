package flyweight_pattern.flyweight_example.stats_repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class UnitStats {

    private String name;
    private int hp;
    private int armour;
    private int damage;
    private int speed;
    private int cost;
}


