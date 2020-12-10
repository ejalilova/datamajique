package codejava.datamodel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Info {

    private int odometerReading;
    private LotLocation lotLocation;
    private String vin;
    private int year;
    private String make;
    private String stockNumber;
    private String body;
    private int numberOfDoors;
    private int numberOfPassengers;
    private int weight;

    private VehicleColor vehicleColor;
    private Engine engine;

    private String vehicleType;
    private String[] comments;
    private String statusDate;
    private String newUsed;
    private int deliveryMiles;
    private int lastServiceMiles;
    private VehicleOption[] vehicleOptions;

    private WarrantyModel warrantyModel;
    private Transmission transmission;
    private PricingInfo pricingInfo;
    private KeyCodes keyCodes;
    private VehicleIndicators vehicleIndicators;

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public LotLocation getLotLocation() {
        return lotLocation;
    }

    public void setLotLocation(LotLocation lotLocation) {
        this.lotLocation = lotLocation;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getStockNumber() {
        return stockNumber;
    }

    public void setStockNumber(String stockNumber) {
        this.stockNumber = stockNumber;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public VehicleColor getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(VehicleColor vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String[] getComments() {
        return comments;
    }

    public void setComments(String[] comments) {
        this.comments = comments;
    }

    public String getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(String statusDate) {
        this.statusDate = statusDate;
    }

    public String getNewUsed() {
        return newUsed;
    }

    public void setNewUsed(String newUsed) {
        this.newUsed = newUsed;
    }

    public int getDeliveryMiles() {
        return deliveryMiles;
    }

    public void setDeliveryMiles(int deliveryMiles) {
        this.deliveryMiles = deliveryMiles;
    }

    public int getLastServiceMiles() {
        return lastServiceMiles;
    }

    public void setLastServiceMiles(int lastServiceMiles) {
        this.lastServiceMiles = lastServiceMiles;
    }

    public VehicleOption[] getVehicleOptions() {
        return vehicleOptions;
    }

    public void setVehicleOptions(VehicleOption[] vehicleOptions) {
        this.vehicleOptions = vehicleOptions;
    }

    public WarrantyModel getWarrantyModel() {
        return warrantyModel;
    }

    public void setWarrantyModel(WarrantyModel warrantyModel) {
        this.warrantyModel = warrantyModel;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public PricingInfo getPricingInfo() {
        return pricingInfo;
    }

    public void setPricingInfo(PricingInfo pricingInfo) {
        this.pricingInfo = pricingInfo;
    }

    public KeyCodes getKeyCodes() {
        return keyCodes;
    }

    public void setKeyCodes(KeyCodes keyCodes) {
        this.keyCodes = keyCodes;
    }

    public VehicleIndicators getVehicleIndicators() {
        return vehicleIndicators;
    }

    public void setVehicleIndicators(VehicleIndicators vehicleIndicators) {
        this.vehicleIndicators = vehicleIndicators;
    }
}
