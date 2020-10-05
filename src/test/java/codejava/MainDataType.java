package codejava;

import java.lang.reflect.Field;
import java.util.List;

public abstract class MainDataType {
    private String VIN;

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public List<Field> reorderFields(List<Field> fields){
        return fields;
    }
}
