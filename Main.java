import java.util.ArrayList;

public class Main {

    public static void main(String args[]){

        ArrayList<Apartment> apartments = new ArrayList<>();
        ArrayList<House> houses = new ArrayList<>();
        ArrayList<Villa> villas = new ArrayList<>();

        FillInProperties(apartments, houses, villas);
        PrintAllProperties(apartments, houses, villas);
        System.out.println("total income is: " +   CalculateTotalIncome(apartments, houses, villas));

    }

    public static void FillInProperties(ArrayList<Apartment> apartments, ArrayList<House> houses, ArrayList<Villa> villas){
        apartments.add(0, new Apartment(01, "John Murphy", "22 New Street", 150, 100, 1, 3 ));
        apartments.add(1, new Apartment(02, "Elizabeth White", "3 Ocean Lane", 250, 102, 2, 4));
        apartments.add(2, new Apartment(03, "Rebecca Jones", "33 Main Street", 300, 120, 2, 6));

        houses.add(0, new House(04, "Joseph Brown", "3 Ocean View", 400, 120, 2, 50));
        houses.add(1, new House(05, "Nancy Potter", "54 Cresmont Court", 450, 110, 3, 80));
        houses.add(2, new House(06, "Garry Waters", "5 Fairwyas", 350, 100, 1, 50));

        villas.add(0, new Villa(07, "Marta Lewandowska", "22 Ocean Avenue", 1000, 130, 50, 2.4));
        villas.add(1, new Villa(12, "Barbara H. Novak", "12 Sandy Road", 1200, 150, 60, 2.5));
        villas.add(2, new Villa(90, "Jerry Longbottom", "16 Paradise Street", 2000, 238, 100, 3.1));

        apartments.get(0).RentProperty(5);
        apartments.get(0).RentProperty(15);
        apartments.get(0).RentProperty(25);
        apartments.get(1).RentProperty(5);
        apartments.get(1).RentProperty(15);
        apartments.get(1).RentProperty(25);
        apartments.get(2).RentProperty(5);
        apartments.get(2).RentProperty(15);
        apartments.get(2).RentProperty(25);

        houses.get(0).RentProperty(5);
        houses.get(0).RentProperty(15);
        houses.get(0).RentProperty(25);
        houses.get(1).RentProperty(5);
        houses.get(1).RentProperty(15);
        houses.get(1).RentProperty(25);
        houses.get(2).RentProperty(5);
        houses.get(2).RentProperty(15);
        houses.get(2).RentProperty(25);

        villas.get(0).RentProperty(5);
        villas.get(0).RentProperty(15);
        villas.get(0).RentProperty(25);
        villas.get(1).RentProperty(5);
        villas.get(1).RentProperty(15);
        villas.get(1).RentProperty(25);
        villas.get(2).RentProperty(5);
        villas.get(2).RentProperty(15);
        villas.get(2).RentProperty(25);

    }

    public static void PrintAllProperties(ArrayList<Apartment> apartments,ArrayList<House> houses, ArrayList<Villa> villas ){
        int i;
        System.out.println("=============== All Apartments ============");
        for(i=0;i<apartments.size();i++)
            System.out.println(apartments.get(i).getRegNumber()+" "+apartments.get(i).getOwnerName()+" "+apartments.get(i).getAddress()+" "+apartments.get(i).getTotalRentalDays()+" "+
                    apartments.get(i).getCostPerDay()+" "+apartments.get(i).getNumberOfStoreys()+" "+apartments.get(i).getNumberOfBeds());
        System.out.println("=============== All Apartments ============");

        System.out.println("=============== All Houses ================");
        for(i=0;i<houses.size();i++)
            System.out.println(houses.get(i).getRegNumber()+" "+houses.get(i).getOwnerName()+" "+houses.get(i).getAddress()+" "+houses.get(i).getTotalRentalDays()+" "+
                    houses.get(i).getCostPerDay()+" "+houses.get(i).getNumberOfStoreys()+" "+houses.get(i).getClearingFees());
        System.out.println("=============== All Houses ================");

        System.out.println("=============== All Villas ================");
        for(i=0;i<villas.size();i++)
            System.out.println(villas.get(i).getRegNumber()+" "+villas.get(i).getOwnerName()+" "+villas.get(i).getAddress()+" "+villas.get(i).getTotalRentalDays()+" "+
                    villas.get(i).getCostPerDay()+"  "+villas.get(i).getRoomServiceCostPerDay()+" "+villas.get(i).getLuxuryTaxPerDay());
        System.out.println("=============== All Villas ================");
    }

    public static int CalculateTotalIncome(ArrayList<Apartment> apartments, ArrayList<House> houses, ArrayList<Villa> villas ){
        int totalIncome = 0; int i;

        for(i=0;i<apartments.size();i++){
            totalIncome+=(apartments.get(i).getCostPerDay()*apartments.get(i).getTotalRentalDays());
        }

        for(i=0;i<houses.size();i++){
            totalIncome+=(houses.get(i).getTotalRentalDays()*houses.get(i).getCostPerDay());
        }

        for(i=0;i<villas.size();i++){
            totalIncome+= (villas.get(i).getTotalRentalDays()*villas.get(i).getCostPerDay());
        }

        return totalIncome;
    }
}
