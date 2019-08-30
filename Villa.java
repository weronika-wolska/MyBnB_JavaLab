/*
    This class extends the Property class and defines the unique attributes of a villa
 */

public class Villa extends Property {
    private int roomServiceCostPerDay;
    private double luxuryTaxPerDay;

    public Villa(){
        this.totalRentalDays=0;
    }

    public Villa(int regNumber, String ownerName, String address, int costPerDay, int numberOfSeasonRentalDays, int roomServiceCostPerDay, double luxuryTaxPerDay){
        this.setRegNumber(regNumber);
        this.setOwnerName(ownerName);
        this.setAddress(address);
        this.setCostPerDay(costPerDay);
        this.setNumberOfSeasonRentalDays(numberOfSeasonRentalDays);
        this.roomServiceCostPerDay=roomServiceCostPerDay;
        this.luxuryTaxPerDay=luxuryTaxPerDay;
        this.totalRentalDays=0;
    }

    public void setRoomServiceCostPerDay(int roomServiceCostPerDay){
        this.roomServiceCostPerDay=roomServiceCostPerDay;
    }

    public int getRoomServiceCostPerDay(){
        return this.roomServiceCostPerDay;
    }

    public void setLuxuryTaxPerDay(double luxuryTaxPerDay){
        this.luxuryTaxPerDay=luxuryTaxPerDay;
    }

    public double getLuxuryTaxPerDay(){
        return this.luxuryTaxPerDay;
    }

}
