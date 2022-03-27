package Task2Cars;

public class VehicleAd {
    private final String model;
    private final String id;
    private final VehicleTypeByPurpose vehicleTypeByPurpose;
    private final VehicleTypeByBodyTypes vehicleTypeByBodyTypes;
    private final VehicleTypeByFuelTypes vehicleTypeByFuelTypes;

    public VehicleAd(String model, String id, VehicleTypeByPurpose vehicleTypeByPurpose, VehicleTypeByBodyTypes vehicleTypeByBodyTypes, VehicleTypeByFuelTypes vehicleTypeByFuelTypes) {
        this.model = model;
        this.id = id;
        this.vehicleTypeByPurpose = vehicleTypeByPurpose;
        this.vehicleTypeByBodyTypes = vehicleTypeByBodyTypes;
        this.vehicleTypeByFuelTypes = vehicleTypeByFuelTypes;
    }

        public VehicleTypeByPurpose getVehicleTypeByPurpose() {
            return vehicleTypeByPurpose;
        }

        public VehicleTypeByBodyTypes getVehicleTypeByBodyTypes() {
            return vehicleTypeByBodyTypes;
        }

        public VehicleTypeByFuelTypes getVehicleTypeByFuelTypes() {
            return vehicleTypeByFuelTypes;
        }

        public String getModel() {
            return model;
        }

        public String getId() {
            return id;
        }
        @Override
        public String toString(){
            return this.model;
        }
    }

