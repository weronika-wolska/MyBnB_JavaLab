/*
    This class extends the Property class and defines the unique attributes of apartments
 */

public class Apartment extends Property{

    private int numberOfStoreys;
    private int numberOfBeds;

    // default constructor
    public Apartment(){
        this.totalRentalDays=0;
    }

    // constructor
    public Apartment(int regNumber, String ownerName, String address, int costPerDay, int numberOfSeasonRentalDays, int numberOfStoreys, int numberOfBeds){
        this.setRegNumber(regNumber);
        this.setOwnerName(ownerName);
        this.setAddress(address);
        this.setCostPerDay(costPerDay);
        this.setNumberOfSeasonRentalDays(numberOfSeasonRentalDays);
        this.numberOfStoreys=numberOfStoreys;
        this.numberOfBeds=numberOfBeds;
        this.totalRentalDays=0;
    }


    public void setNumberOfStoreys(int numberOfStoreys){
        this.numberOfStoreys=numberOfStoreys;
    }


    public int getNumberOfStoreys(){
        return this.numberOfStoreys;
    }

    public void setNumberOfBeds(int numberOfBeds){
        this.numberOfBeds=numberOfBeds;
    }

    public int getNumberOfBeds(){
        return this.numberOfBeds;
    }

}
