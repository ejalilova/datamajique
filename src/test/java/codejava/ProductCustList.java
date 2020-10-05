package codejava;

import java.lang.reflect.Field;
import java.util.List;

public class ProductCustList extends MainDataType{
    private String EMAIL;
    private String EMAIL_OPT_IN;
    private String OPERATION_TYPE;
    private String OPERATION_SALE_TYPE;
    private String OPERATION_DATE;
    private String CELLPHONE;
    private String CELLPHONE_OPT_IN;
    private String FIRST_NAME;
    private String LAST_NAME;
    private String ZIPCODE;
    private String PROVIDER_ID;
    private String LOCATION_ID;

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getEMAIL_OPT_IN() {
        return EMAIL_OPT_IN;
    }

    public void setEMAIL_OPT_IN(String EMAIL_OPT_IN) {
        this.EMAIL_OPT_IN = EMAIL_OPT_IN;
    }

    public String getOPERATION_TYPE() {
        return OPERATION_TYPE;
    }

    public void setOPERATION_TYPE(String OPERATION_TYPE) {
        this.OPERATION_TYPE = OPERATION_TYPE;
    }

    public String getOPERATION_SALE_TYPE() {
        return OPERATION_SALE_TYPE;
    }

    public void setOPERATION_SALE_TYPE(String OPERATION_SALE_TYPE) {
        this.OPERATION_SALE_TYPE = OPERATION_SALE_TYPE;
    }

    public String getOPERATION_DATE() {
        return OPERATION_DATE;
    }

    public void setOPERATION_DATE(String OPERATION_DATE) {
        this.OPERATION_DATE = OPERATION_DATE;
    }

    public String getCELLPHONE() {
        return CELLPHONE;
    }

    public void setCELLPHONE(String CELLPHONE) {
        this.CELLPHONE = CELLPHONE;
    }

    public String getCELLPHONE_OPT_IN() {
        return CELLPHONE_OPT_IN;
    }

    public void setCELLPHONE_OPT_IN(String CELLPHONE_OPT_IN) {
        this.CELLPHONE_OPT_IN = CELLPHONE_OPT_IN;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

    public String getZIPCODE() {
        return ZIPCODE;
    }

    public void setZIPCODE(String ZIPCODE) {
        this.ZIPCODE = ZIPCODE;
    }

    public String getPROVIDER_ID() {
        return PROVIDER_ID;
    }

    public void setPROVIDER_ID(String PROVIDER_ID) {
        this.PROVIDER_ID = PROVIDER_ID;
    }

    public String getLOCATION_ID() {
        return LOCATION_ID;
    }

    public void setLOCATION_ID(String LOCATION_ID) {
        this.LOCATION_ID = LOCATION_ID;
    }

    @Override
    public List<Field> reorderFields(List<Field> fields) {
        Field vinField = fields.get(0);
        fields.remove(0);
        fields.add(2, vinField);
        return fields;
    }
}
