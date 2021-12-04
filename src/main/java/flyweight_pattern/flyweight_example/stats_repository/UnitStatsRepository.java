package flyweight_pattern.flyweight_example.stats_repository;

public class UnitStatsRepository {

    private static final UnitStats destroyerStats = new UnitStats("Destroyer", 500, 250, 70, 10, 800);
    private static final UnitStats riflemanStats = new UnitStats("Rifleman", 50, 10, 5, 15, 50);
    private static final UnitStats teslaTankStats = new UnitStats("Rifleman", 400, 300, 50, 10, 500);

    private UnitStatsRepository() {
    }

    public static UnitStats getDestroyerStats() {
        return destroyerStats;
    }
    public static UnitStats getRiflemanStats() {
        return riflemanStats;
    }
    public static UnitStats getTeslaTankStats() {
        return teslaTankStats;
    }
}

