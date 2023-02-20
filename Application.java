
public class Application {
	public static void main(String[] args) {
		//testing Building
		Building building1 = new Building("Bellarmine", "2001 Newburg Rd.", 20988.0, "Residential", "R-1");
		
		//testing getters and setters
		building1.setProjectName("Bellarmine");
		building1.setCompleteAddress("2001 Newburg Rd.");
		building1.setTotalSquareFeet(20988.0);
		building1.setOccupancyGroup("Residential");
		building1.setSubgroup("R-1");
		System.out.println("Projectname: " + building1.getprojectName());;
		System.out.println("CompleteAddress: " +building1.getcompleteAddress());
		System.out.println("Total Square Feet: " +building1.gettotalSquareFeet());
		System.out.println("OccupanyGroup: " +building1.getoccupancyGroup()); 
		System.out.println("SubGroup: " +building1.getsubgroup());
		
		//testing toString method
		System.out.println(building1.toString());
		System.out.println();
		//testing Business
		Business business1 = new Business("Ice Museum", "200 E chestnut st.", 5509.0, "Business", "Group B", 306);
		
		//testing getters and setters
		business1.setProjectName("Ice Museum");
		business1.setCompleteAddress("200 E chestnut st.");
		business1.setTotalSquareFeet(5509.0);
		business1.setOccupancyGroup("Business"); 
		business1.setSubgroup("Group B");
		business1.setNumRentableUnits(306);
		System.out.println("Projectname: " + business1.getprojectName());;
		System.out.println("CompleteAddress: " +business1.getcompleteAddress());
		System.out.println("Total Square Feet: " +business1.gettotalSquareFeet());
		System.out.println("OccupanyGroup: " +business1.getoccupancyGroup()); 
		System.out.println("SubGroup: " +business1.getsubgroup());
		System.out.println("Num of Rentable Units: " +business1.getnumRentableUnits());
		
		//testing toString method
		System.out.println(business1.toString());
		System.out.println();
		//testing Residential
		Residential residential1 = new Residential("Peaks Palace", "12875 Saint Marges Dr.", 65784.0, "Residential", "R-4", 5, 6, true);
		
		//testing getters and setters
		residential1.setProjectName("Peaks Palace");
		residential1.setCompleteAddress("12875 Saint Marges Dr.");
		residential1.setTotalSquareFeet(65784.0);
		residential1.setOccupancyGroup("Residential");
		residential1.setSubgroup("R-4");
		residential1.setNumBedrooms(5);
		residential1.setNumBathrooms(6);
		residential1.setLaundryRoom(true);
		System.out.println("Projectname: " +residential1.getprojectName());
		System.out.println("CompleteAddress: " +residential1.getcompleteAddress()); 
		System.out.println("Total Square Feet: " +residential1.gettotalSquareFeet());
		System.out.println("OccupanyGroup: "+residential1.getoccupancyGroup());
		System.out.println("SubGroup: " +residential1.getsubgroup()); 
		System.out.println("Num Bedrooms: " +residential1.getnumBedrooms());
		System.out.println("Num Bathrooms: " +residential1.getnumBathrooms());
		System.out.println("Is there a laundry room: " +residential1.getlaundryRoom());
		
		//testing toString method
		System.out.println(residential1.toString());
		System.out.println();
		//testing Mall
		Mall mall1 = new Mall("Jefferson Mall", "3000 W johnson rd", 4509.0, "Business", "Group B", 453, 65, 654.0, 432);
		
		//testing getters and setters
		mall1.setProjectName("Jefferson Mall");
		mall1.setCompleteAddress("3000 W johnson rd");
		mall1.setTotalSquareFeet(4509.0);
		mall1.setOccupancyGroup("Business"); 
		mall1.setSubgroup("Group B");
		mall1.setNumRentableUnits(453); 
		mall1.setNumRentedUnits(65);
		mall1.setMedianUnitSpace(654.0);
		mall1.setNumParkingSpaces(432);
		System.out.println("Projectname:" + mall1.getprojectName());;
		System.out.println("CompleteAddress:"+mall1.getcompleteAddress());
		System.out.println("Total Square Feet:"+mall1.gettotalSquareFeet());
		System.out.println("OccupanyGroup:"+mall1.getoccupancyGroup()); 
		System.out.println("SubGroup: " +mall1.getsubgroup());
		System.out.println("Num of rentable units: " +mall1.getnumRentableUnits()); 
		System.out.println("Num of rented units: " +mall1.getnumRentedUnits());
		System.out.println("median units: " +mall1.getmedianUnitSpace());
		System.out.println("Num of parking spaces: " +mall1.getnumParkingSpaces());
		//testing toString method
		System.out.println(mall1.toString());
		System.out.println();
		//testing Apartment
		Apartment apartment1 = new Apartment("The Marshall", "2004 S. 4th St.", 5678.0, "Residential", "R-2", 2, 3, true, 873, 254.0, true); 
		
		//testing getters and setters
		apartment1.setProjectName("The Marshall");
		apartment1.setCompleteAddress("2004 S. 4th St.");
		apartment1.setTotalSquareFeet(5678.0);
		apartment1.setOccupancyGroup("Residential");
		apartment1.setSubgroup("R-2");
		apartment1.setNumBedrooms(2);
		apartment1.setNumBathrooms(3);
		apartment1.setLaundryRoom(true);
		apartment1.setNumRentableUnits(873);
		apartment1.setAvgUnitSize(254.0);
		apartment1.setParkingAvailable(true);
		System.out.println("Projectname: " +apartment1.getprojectName());
		System.out.println("CompleteAddress: " +apartment1.getcompleteAddress()); 
		System.out.println("Total Square Feet: " +apartment1.gettotalSquareFeet());
		System.out.println("OccupanyGroup: " +apartment1.getoccupancyGroup());
		System.out.println("SubGroup " +apartment1.getsubgroup()); 
		System.out.println("Num Bedrooms: " +apartment1.getnumBedrooms());
		System.out.println("Num Bathrooms: " +apartment1.getnumBathrooms());
		System.out.println("Is there a laundry room: " +apartment1.getlaundryRoom());
		System.out.println("Num of rentable units: " +apartment1.getnumRentableUnits());
		System.out.println("Num of rented units: " +apartment1.getavgUnitSize());
		System.out.println("Num of parking spaces: " +apartment1.getparkingAvailable());
		
		//testing toString method
		System.out.println(apartment1.toString());
		System.out.println();
		//testing SingleFamilyHome
		SingleFamilyHome sFH = new SingleFamilyHome("Leahs House", "143 Main St", 2545.0, "Residential", "R-1", 4, 3, true, true);
		
		//testing getters and setters
		sFH.setProjectName("Leahs House");
		sFH.setCompleteAddress("143 Main St");
		sFH.setTotalSquareFeet(2545.0);
		sFH.setOccupancyGroup("Residential");
		sFH.setSubgroup("R-1");
		sFH.setNumBedrooms(4);
		sFH.setNumBathrooms(3);
		sFH.setLaundryRoom(true);
		sFH.setGarage(true);
		System.out.println("Projectname: " +sFH.getprojectName());
		System.out.println("CompleteAddress: " +sFH.getcompleteAddress()); 
		System.out.println("Total Square Feet: " +sFH.gettotalSquareFeet());
		System.out.println("OccupanyGroup: " +sFH.getoccupancyGroup());
		System.out.println("SubGroup: " + sFH.getsubgroup()); 
		System.out.println("Num Bedrooms: " +sFH.getnumBedrooms());
		System.out.println("Num Bathrooms: " +sFH.getnumBathrooms());
		System.out.println("Is there a laundry room: " +sFH.getlaundryRoom());
		
		//testing toString method
		System.out.println(sFH.toString());
		System.out.println();
	}
}