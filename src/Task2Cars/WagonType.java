package Task2Cars;

public class WagonType extends VehicleTypeByBodyTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.WAGON.name();
    }
}
