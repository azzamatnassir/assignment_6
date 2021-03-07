package subtask3;

import java.util.Scanner;

public class Test {

    static Scanner sc = new Scanner(System.in);
    private static Builder builder;

    public static void main(String[] args) {
        Director director = new Director();

        HouseBuilder houseBuilder = new HouseBuilder();
        director.constructGarageHouse(houseBuilder);

        HouseManualBuilder manualBuilder = new HouseManualBuilder();
        director.constructGarageHouse(manualBuilder);
        Manual manual = manualBuilder.getResult();
        System.out.println("\nHouse manual built:\n" + manual.print());
    }
}
