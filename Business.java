
public class Business extends Building{
	protected int numRentableUnits;
	public Business() {
		int numRentableUnits = 0;
	}
	public Business(String pN, String cA, double tSF, String oG, String sg, int nRU) {
		String projectName = pN;
		String completeAddress = cA;
		double totalSquareFeet = tSF;
		String occupancyGroup = oG;
		String subgroup = sg;
		int numRentableUnits = nRU;
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
	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}
	
}