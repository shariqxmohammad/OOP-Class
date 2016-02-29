
public class TestJobApplicants {

	public static void main(String[] args) {
	JobApplicant app1 = new JobApplicant("rosy", "911", true, true, true, false);
	JobApplicant app2 = new JobApplicant("bobby", "469-212-0000", false, true, false, true);
	String qualified = "is qualified for this. ";
	String notQualified = "ain't qualified for this!! ";
	
	if(isQualified(app1))
		display(app1, qualified);
	else
		display(app1, notQualified);
	if(isQualified(app2))
		display(app2, qualified);
	else
		display(app2, notQualified);
	}
	
	public static boolean isQualified(JobApplicant app)
	{
		// A qualified applicant has at least three of the four skills.
		int skillCount = 0; 
		boolean isQualified; 
		final int MIN_SKILLS = 3; 
		if(app.getDatabaseSkill())
			skillCount = skillCount +1; 
		if(app.getGraphicsSkill())
			skillCount = skillCount + 1; 
		if(app.getSpreadsheetSkill())
			skillCount = skillCount + 1;
		if(app.getWordSkill())
			skillCount = skillCount +1;
		if(skillCount >= MIN_SKILLS)
			isQualified = true;
		else
			isQualified = false;
		return isQualified;	
	 }
	
	public static void display(JobApplicant app, String msg)
	{
		System.out.println(app.getName() + " " + msg + "Phone : " + app.getPhoneNumber() );
		
	}


}
