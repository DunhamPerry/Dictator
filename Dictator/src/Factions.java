
public class Factions {
	
	private String factionName;
	private int factionValue;
	
	public Factions(String fn, int fv){
		factionName = fn;
		factionValue = fv;
	}

	public int getFactionValue() {
		return factionValue;
	}

	public void setFactionValue(int factionValue) {
		this.factionValue = factionValue;
	}

	public String getFactionName() {
		return factionName;
	}

	public void setFactionName(String factionName) {
		this.factionName = factionName;
	}

	public static Factions get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
