
public class JobApplicant {
	
	private String name; 
	private String phoneNumber;
	private boolean wordSkill;
	private boolean spreadsheetSkill;
	private boolean databaseSkill;
	private boolean graphicsSkill; 
	
public JobApplicant(String name, String phone, boolean w, boolean s, boolean d, boolean g){
	this.name = name; 
	this.phoneNumber = phone; 
	this.wordSkill = w; 
	this.spreadsheetSkill = s;
	this.databaseSkill = d; 
	this.graphicsSkill = g; 

}

public String getName() {
	return name;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public boolean getWordSkill() {
	return wordSkill;
}

public boolean getSpreadsheetSkill() {
	return spreadsheetSkill;
}

public boolean getDatabaseSkill() {
	return databaseSkill;
}

public boolean getGraphicsSkill() {
	return graphicsSkill;
}
	 


}
