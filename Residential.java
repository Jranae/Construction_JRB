
public class Residential extends Building {
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	public Residential() {
		int numBedrooms = 0;
		int numBathrooms = 0;
		boolean laundryRoom = false;
	}
	public Residential(String pN, String cA, double tSF, String oG, String sg, int nB, int nR, boolean lR) {
		String projectName = pN;
		String completeAddress = cA;
		double totalSquareFeet = tSF;
		String occupancyGroup = oG;
		String subgroup = sg;
		int numBedrooms = nB;
		int numBathrooms = nR;
		boolean laundryRoom = lR;
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
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + ", projectName=" + projectName + ", completeAddress=" + completeAddress
				+ ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup="
				+ subgroup + "]";
	}
	
}
