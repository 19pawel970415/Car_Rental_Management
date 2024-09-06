package org.example.domain;

import org.example.db.CarsRepo;

import java.util.Arrays;

public class CarsGenerator {
    private static final CarFactory CAR_FACTORY_BMW = new BMWFactory();
    private static final CarFactory CAR_FACTORY_MERCEDES = new MercedesFactory();
    private static final CarFactory CAR_FACTORY_VW = new VWFactory();

    public static void generateCars() {
        Car bmwHatchback = CAR_FACTORY_BMW.createHatchback(BMWModel.SERIES_8, FoldingRearSeatsConfig.FORTY);
        Car bmwSedan = CAR_FACTORY_BMW.createSedan(BMWModel.X6, TrunkDivider.CUSTOM_FIT);
        Car bmwWagon = CAR_FACTORY_BMW.createWagon(BMWModel.i8, CargoCover.HARD);


        Car mercedesHatchback = CAR_FACTORY_MERCEDES.createHatchback(MercedesModel.GLA, FoldingRearSeatsConfig.FIFTY);
        Car mercedesSedan = CAR_FACTORY_MERCEDES.createSedan(MercedesModel.A_CLASS, TrunkDivider.ADJUSTABLE);
        Car mercedesWagon = CAR_FACTORY_MERCEDES.createWagon(MercedesModel.AMG_GT, CargoCover.SOFT);

        Car vwHatchback = CAR_FACTORY_VW.createHatchback(VWModel.GOLF, FoldingRearSeatsConfig.SIXTY);
        Car vwSedan = CAR_FACTORY_VW.createSedan(VWModel.POLO, TrunkDivider.EXPANDABLE);
        Car vwWagon = CAR_FACTORY_VW.createWagon(VWModel.TIGUAN, CargoCover.RETRACTABLE);

        CarsRepo.getInstance().setCars(
                Arrays.asList(
                        bmwHatchback, bmwSedan, bmwWagon,
                        mercedesHatchback, mercedesSedan, mercedesWagon,
                        vwHatchback, vwSedan, vwWagon
                )
        );
    }
}
