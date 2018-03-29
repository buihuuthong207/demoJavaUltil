package demoMap;

public class Football {
	private String Coach;
    private String CenterBack;
    private String MidFielder;
    
    public Football(String coach, String CB, String MF)
    {
    	this.Coach = coach;
    	this.CenterBack = CB;
    	this.MidFielder = MF;
    }
    
	public String getCoach() {
		return Coach;
	}
	public void setCoach(String coach) {
		Coach = coach;
	}
	public String getCenterBack() {
		return CenterBack;
	}
	public void setCenterBack(String centerBack) {
		CenterBack = centerBack;
	}
	public String getMidFielder() {
		return MidFielder;
	}
	public void setMidFielder(String midFielder) {
		MidFielder = midFielder;
	}
    
	public String toString()
	{
		return "Huan luan vien: " + this.Coach + ", Hau ve: " + this.CenterBack + "Tien ve: " + this.MidFielder;
	}
}
