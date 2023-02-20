
public class  Mall extends Business {
	private int numRentedUnits;
	private double medianUnitSpace;
	private int numParkingSpaces;
	public Mall() {
		int numRentedUnits = 0;
		double medianUnitSpace = 0;
		int numParkingSpaces = 0;
	}
	public Mall(String pN, String cA, double tSF, String oG, String sg,int nRU, int nU, double mUS, int nPS) {
		String projectName = pN;
		String completeAddress = cA;
		double totalSquareFeet = tSF;
		String occupancyGroup = oG;
		String subgroup = sg;
		int numRentableUnits = nRU;
		int numbRentedUnits = nU;
		double medianUnitSpace = mUS;
		int numParkingSpaces = nPS;
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
		System.out.println(numRentableUnits);
		System.out.println(numRentedUnits);
		System.out.println(medianUnitSpace);
		System.out.println(numParkingSpaces);
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
	public int getnumRentableUnits() {
		return numRentableUnits;
	}
	public int getnumRentedUnits() {
		return numRentedUnits;
	}
	public double getmedianUnitSpace()	{
		return medianUnitSpace;
	}
	public int getnumParkingSpaces() {
		return numParkingSpaces;
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
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}
	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}
	public void setMedianUnitSpace(double medianUnitSpace) {
		this.medianUnitSpace = medianUnitSpace;
	}
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}
	public String toString() {
		return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSpace=" + medianUnitSpace + ", numParkingSpaces="
				+ numParkingSpaces + ", numRentableUnits=" + numRentableUnits + ", projectName=" + projectName
				+ ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup="
				+ occupancyGroup + ", subgroup=" + subgroup + "]";
	}
	
	
}
	
