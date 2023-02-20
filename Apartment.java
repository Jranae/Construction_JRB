
public class Apartment extends Residential{
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	public Apartment() {
		 int numRentableUnits = 0;
		 double avgUnitSize = 0;
		 boolean parkingAvailable = true;
	}
	public Apartment(String pN, String cA, double tSF, String oG, String sg,int nB, int nR, boolean lR, int nU, double aUS, boolean pA) {
		String projectName = pN;
		String completeAddress = cA;
		double totalSquareFeet = tSF;
		String occupancyGroup = oG;
		String subgroup = sg;
		int numBedrooms = nB;
		int numBathrooms = nR;
		boolean laundryRoom = lR;
		int numRentableUnits = nU;
		double avgUnitSize = aUS;
		boolean parkingAvailable = pA;
	}
	public void draw() {
		System.out.println("<<Object Type>>");
	}
	public String displayData() {
		System.out.println(projectName);
		System.out.println(completeAddress);
		System.out.println(totalSquareFeet);
		System.out.println(occupancyGroup); 
		System.out.println(subgroup);
		System.out.println(numBedrooms);
		System.out.println(numBathrooms);
		System.out.println(laundryRoom);
		System.out.println(numRentableUnits);
		System.out.println(avgUnitSize);
		System.out.println(parkingAvailable);
		return "This should return the data in displaydata.";
	}
	public String getprojectName() {
		return projectName;
	}
	public String getcompleteAddress() {
		return completeAddress;
	}
	public double gettotalSquareFeet() {
		return totalSquareFeet;
	}
	public String getoccupancyGroup() {
		return occupancyGroup;
	}
	public String getsubgroup() {
		return subgroup;
	}
	public int getnumBedrooms() {
		return numBedrooms;
	}
	public int getnumBathrooms() {
		return numBathrooms;
	}
	public boolean getlaundryRoom() {
		return laundryRoom;
	}
	public int getnumRentableUnits() {
		return numRentableUnits;
	}
	public double getavgUnitSize() {
		return avgUnitSize;
	}
	public boolean getparkingAvailable() {
		return parkingAvailable;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}
	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}
	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}
	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}
	@Override
	public String toString() {
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + ", numBedrooms=" + numBedrooms + ", numBathrooms="
				+ numBathrooms + ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}
	
}
