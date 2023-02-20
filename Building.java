
public class Building {
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;

	public Building() {
		String projectName = "";
		String completeAddress = "";
		double totalSquareFeet = 0.0;
		String occupancyGroup = "";
		String subgroup = "";
	}
	public Building(String pN, String cA, double tSF, String oG, String sg) {
		String projectName = pN;
		String completeAddress = cA;
		double totalSquareFeet = tSF;
		String occupancyGroup = oG;
		String subgroup = sg;
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
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "]";
	}
	}
