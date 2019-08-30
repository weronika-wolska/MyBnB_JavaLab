/*
    This is a superclass for all property objects
 */

public class Property {
    private int regNumber;
    private String ownerName;
    private String address;
    private int costPerDay;
    private int numberOfSeasonRentalDays;
    int totalRentalDays;


    public Property(){
        totalRentalDays=0;
    }


    public Property(int regNumber, String ownerName, String address, int costPerDay, int numberOfSeasonRentalDays){
        this.regNumber=regNumber;
        this.ownerName=ownerName;
        this.address=address;
        this.costPerDay=costPerDay;
        this.numberOfSeasonRentalDays=numberOfSeasonRentalDays;
        this.totalRentalDays=0;
    }


    public void RentProperty(int numberOfDays){
        totalRentalDays+=numberOfDays;
    }


    public int getTotalRentalDays() {
        return totalRentalDays;
    }

    public void setRegNumber(int regNumber){
        this.regNumber = regNumber;
    }


    public int getRegNumber(){
        return this.regNumber;
    }


    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }


    public String getOwnerName(){
        return this.ownerName;
    }


    public void setAddress(String address){
        this.address=address;
    }


    public String getAddress(){
        return this.address;
    }


    public void setCostPerDay(int costPerDay){
        this.costPerDay=costPerDay;
    }


    public int getCostPerDay(){
        return costPerDay;
    }


    public void setNumberOfSeasonRentalDays(int numberOfSeasonRentalDays){
        this.numberOfSeasonRentalDays=numberOfSeasonRentalDays;
    }


    public int getNumberOfSeasonRentalDays(){
        return numberOfSeasonRentalDays;
    }
}
