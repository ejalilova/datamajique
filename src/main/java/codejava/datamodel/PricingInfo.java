package codejava.datamodel;

public class PricingInfo {

    private int holdBack;
    private int advertisingAmount;
    private int invoiceAmount;
    private int marketValue;
    private int totalCost;
    private int originalCost;
    private int originalPrice;
    private int costBump;
    private int totalPrice;

    public int getAdvertisingAmount() {
        return advertisingAmount;
    }

    public void setAdvertisingAmount(int advertisingAmount) {
        this.advertisingAmount = advertisingAmount;
    }

    public int getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(int invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public int getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(int marketValue) {
        this.marketValue = marketValue;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public int getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(int originalCost) {
        this.originalCost = originalCost;
    }

    public int getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(int originalPrice) {
        this.originalPrice = originalPrice;
    }

    public int getCostBump() {
        return costBump;
    }

    public void setCostBump(int costBump) {
        this.costBump = costBump;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getHoldBack() {
        return holdBack;
    }

    public void setHoldBack(int holdBack) {
        this.holdBack = holdBack;
    }
}
