package codejava.datamodel;

public class VehicleIndicators {

    private boolean airConditioning;
    private boolean certifiedPreOwned;
    private boolean fleet;
    private boolean commercial;

    public boolean isAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    public boolean isCertifiedPreOwned() {
        return certifiedPreOwned;
    }

    public void setCertifiedPreOwned(boolean certifiedPreOwned) {
        this.certifiedPreOwned = certifiedPreOwned;
    }

    public boolean isFleet() {
        return fleet;
    }

    public void setFleet(boolean fleet) {
        this.fleet = fleet;
    }

    public boolean isCommercial() {
        return commercial;
    }

    public void setCommercial(boolean commercial) {
        this.commercial = commercial;
    }
}
