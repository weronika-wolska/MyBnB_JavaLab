/*
    This class extends the Property class and defines the unique attributes of a house
 */

public class House extends Property{

    private int numberOfStoreys;
    private int clearingFees;

    public House(){
        this.totalRentalDays=0;
    }

    public House(int regNumber, String ownerName, String address, int costPerDay, int numberOfSeasonRentalDays, int numberOfStoreys, int clearingFees){
        this.setRegNumber(regNumber);
        this.setOwnerName(ownerName);
        this.setAddress(address);
        this.setCostPerDay(costPerDay);
        this.setNumberOfSeasonRentalDays(numberOfSeasonRentalDays);
        this.numberOfStoreys=numberOfStoreys;
        this.clearingFees=clearingFees;
        this.totalRentalDays=0;
    }

    public void setNumberOfStoreys(int numberOfStoreys){
        this.numberOfStoreys=numberOfStoreys;
    }

    public int getNumberOfStoreys(){
        return  numberOfStoreys;
    }

    public void setClearingFees(int clearingFees){
        this.clearingFees=clearingFees;
    }

    public int getClearingFees(){
        return clearingFees;
    }
}
