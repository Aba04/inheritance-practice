package Task2Cars;

public class SedanType extends VehicleTypeByBodyTypes{
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.SEDAN.name();
    }
}
