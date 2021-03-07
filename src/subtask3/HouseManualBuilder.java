package subtask3;

import java.util.Map;

public class HouseManualBuilder implements Builder{
    private int walls;
    private int doors;
    private int windows;
    private boolean garage;
    private boolean pool;
    private boolean statues;
    private boolean garden;

    @Override
    public void buildWalls(int walls) {
        this.walls = walls;
    }

    @Override
    public void buildDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public void buildWindows(int windows) {
        this.windows = windows;
    }

    @Override
    public void buildRoof() {

    }

    @Override
    public void buildGarage(boolean hasGarage) {
        this.garage = hasGarage;
    }

    @Override
    public void buildPool(boolean hasPool) {
        this.pool = hasPool;
    }

    @Override
    public void buildStatue(boolean hasStatues) {
        this.statues = hasStatues;
    }

    @Override
    public void buildGarden(boolean hasGarden) {
        this.garden = hasGarden;
    }

    public Manual getResult(){
        return new Manual(walls, doors, windows, garage, pool, statues, garden);
    }
}
