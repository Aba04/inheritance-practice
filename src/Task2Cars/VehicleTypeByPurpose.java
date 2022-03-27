package Task2Cars;

public class VehicleTypeByPurpose extends VehicleType{
    public VehicleTypeByPurpose() {
        super("purpose");
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        VehicleTypeByPurpose that = (VehicleTypeByPurpose) object;
        return attribute != null && attribute.equals(that.attribute);
    }
}
