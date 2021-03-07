package subtask3;

public class House {
    private final int walls;
    private final int doors;
    private final int windows;
    private final boolean garage;
    private final boolean pool;
    private final boolean statues;
    private final boolean garden;

    public House(int walls, int doors, int windows, boolean garage, boolean pool, boolean statues, boolean garden) {
        this.walls = walls;
        this.doors = doors;
        this.windows = windows;
        this.garage = garage;
        this.pool = pool;
        this.statues = statues;
        this.garden = garden;
    }

    public int getWalls() {
        return walls;
    }

    public int getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }

    public boolean getGarage(){
        return garage;
    }

    public boolean getPool(){
        return pool;
    }

    public boolean getStatues(){
        return statues;
    }

    public boolean getGarden(){
        return garden;
    }
}
