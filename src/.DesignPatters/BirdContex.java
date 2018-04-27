package DesignPatters;

public class BirdContex {
	
	private Birds Strategy;

	public BirdContex(Birds bd) {
		this.Strategy = bd;
	}
	
	public String makeBirdSpeak() {
		return this.Strategy.speak();
	}

}
