package Task2Cars;

public class TestDrive {
    public static void main(String[] args) {
        AdsService adsService = new AdsService();
        VehicleAd ad1 = new VehicleAd("Volvo", "123", new PassengerType(), new SedanType(), new PetrolType());
        VehicleAd ad2 = new VehicleAd("Kamaz", "45", new TruckType(), new PickupType(), new DieselType());
        VehicleAd ad3 = new VehicleAd("", "77", new CarType(),new SedanType(), new DieselType());

        adsService.setAdList(new VehicleAd[]{ ad1, ad2, ad3 });

        adsService.filterByVehicleTypeByPurpose(new PassengerType());
        adsService.filterByVehicleTypeByPurpose(new TruckType());
        adsService.filterByVehicleTypeByFuelTypes(new PetrolType());
    }
}