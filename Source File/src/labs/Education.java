//Michael Hannigan Team 2
package labs;

public class Education{
	//this class creates education objects that give us information about
	//a professor's background
	
	//attributes
	private String Degree = "PhD";
	private String Major = "Engineering";
	private int Research = 0;
	
	//default constructor
	public Education(){
		
	}

	//constructor
	public Education(String dg, String mj, int rs) {
		this.Degree = dg;
		this.Major = mj;
		this.Research = rs;
	}
	
	//this method returns the degree attribute
	public String getDegree() {
		return this.Degree;
	}
	
	//this method returns the major attribute
	public String getMajor() {
		return this.Major;
	}
	
	//this method returns the research attribute
	public int getResearch() {
		return this.Research;
	}
	
	//this method takes in a string and sets it to the degree attribute
	public void setDegree(String deg) {
		this.Degree = deg;
	}
	
	//this method takes in a string and sets it to the major attribute
	public void setMajor(String maj) {
		this.Major = maj;
	}
	
	//this method takes in an integer and sets it to the research attribute
	public void setResearch(int rs) {
		this.Research = rs;
	}
}
