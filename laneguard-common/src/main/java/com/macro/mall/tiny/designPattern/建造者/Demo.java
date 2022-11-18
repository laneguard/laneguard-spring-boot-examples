package com.macro.mall.tiny.designPattern.建造者;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());

        /**
         * Car built:
         * SPORTS_CAR
         *
         * Car manual built:
         * Type of car: SPORTS_CAR
         * Count of seats: 2
         * Engine: volume - 3.0; mileage - 0.0
         * Transmission: SEMI_AUTOMATIC
         * Trip Computer: Functional
         * GPS Navigator: Functional
         */
    }

}