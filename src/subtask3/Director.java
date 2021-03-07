package subtask3;

public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void constructGarageHouse(Builder builder){
        builder.buildWalls(7);
        builder.buildDoors(2);
        builder.buildWindows(1);
        builder.buildRoof();
        builder.buildGarage(true);
        builder.buildPool(false);
        builder.buildStatue(false);
        builder.buildGarden(false);
    }

    public void constructPoolHouse(Builder builder){
        builder.buildWalls(4);
        builder.buildDoors(1);
        builder.buildWindows(2);
        builder.buildRoof();
        builder.buildGarage(false);
        builder.buildPool(true);
        builder.buildStatue(false);
        builder.buildGarden(false);
    }

    public void constructStatueHouse(Builder builder){
        builder.buildWalls(4);
        builder.buildDoors(1);
        builder.buildWindows(3);
        builder.buildRoof();
        builder.buildGarage(false);
        builder.buildPool(false);
        builder.buildStatue(true);
        builder.buildGarden(false);
    }

    public void constructGardenHouse(Builder builder){
        builder.buildWalls(4);
        builder.buildDoors(1);
        builder.buildWindows(4);
        builder.buildRoof();
        builder.buildGarage(false);
        builder.buildPool(false);
        builder.buildStatue(false);
        builder.buildGarden(true);
    }
}
