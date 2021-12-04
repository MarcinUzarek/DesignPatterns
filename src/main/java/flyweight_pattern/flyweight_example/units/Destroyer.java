package flyweight_pattern.flyweight_example.units;

import flyweight_pattern.flyweight_example.stats_repository.UnitStats;
import lombok.ToString;

import static flyweight_pattern.flyweight_example.stats_repository.UnitStatsRepository.getDestroyerStats;

@ToString
public class Destroyer {

    private int x;
    private int y;
    private int hpLeft;
    private final UnitStats stats;

    public Destroyer(int x, int y) {
        stats = getDestroyerStats();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();
    }

}
