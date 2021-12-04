package flyweight_pattern.flyweight_example.units;

import flyweight_pattern.flyweight_example.stats_repository.UnitStats;

import static flyweight_pattern.flyweight_example.stats_repository.UnitStatsRepository.getTeslaTankStats;

public class TeslaTank {

    private final UnitStats stats;
    private final int x;
    private final int y;
    private final int hpLeft;

    public TeslaTank(int x, int y) {
        stats = getTeslaTankStats();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();
    }
}
