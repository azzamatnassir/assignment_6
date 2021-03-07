package subtask3;

public class Manual {
    private final int walls;
    private final int doors;
    private final int windows;
    private final boolean garage;
    private final boolean pool;
    private final boolean statues;
    private final boolean garden;

    public Manual(int walls, int doors, int windows, boolean garage, boolean pool, boolean statues, boolean garden) {
        this.walls = walls;
        this.doors = doors;
        this.windows = windows;
        this.garage = garage;
        this.pool = pool;
        this.statues = statues;
        this.garden = garden;
    }

    public String print(){
        String info = "";

        info += "House has:\n";
        info += walls + " walls\n";
        info += doors + " doors\n";
        info += windows + " windows\n";
        info += "roof\n";

        if (garage)
            info += "garage\n";
        if (statues)
            info += "statues\n";
        if (pool)
            info += "pool\n";
        if (garden)
            info += "garden\n";

        return info;
    }
}
