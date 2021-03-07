package subtask3;

public interface Builder {
    void buildWalls(int walls);
    void buildDoors(int doors);
    void buildWindows(int windows);
    void buildRoof();
    void buildGarage(boolean hasGarage);
    void buildPool(boolean hasPool);
    void buildStatue(boolean hasStatues);
    void buildGarden(boolean hasGarden);
}
